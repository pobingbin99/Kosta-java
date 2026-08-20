package ex0805.constructor.goods;

/**
 * 각 요청에 대한 로직(기능)을 담당할 클래스
 * 등록, 전체검색, 부분검색, 수정, 삭제 등...
 */
public class GoodsService{
	//상품을 관리할 배열
	private Goods [] goodsArr = new Goods[10];
	
	//배열방에 저장한 객체의 개수 
	public static int count;

   /**
    * 초기치 데이터를 세팅하는 메소드
    */
   public void init(String[][] data){
		for (int i = 0; i < data.length; i++) {
			goodsArr[count++] = create(data[i]);
		}
   }

   /**
    * Goods를 생성해서 값을 설정하고 생성된 Goods를 리턴하는 메소드 
    */
   private Goods create(String[] row) {
	   return new Goods(row[0], row[1], Integer.parseInt(row[2]), row[3]);
   }

   /**
    * 등록(등록실패 - 중복인 경우, 배열의 길이 벗어난경우)
    * @return 0이면 중복 , 1이면 성공, -1이면 크기 초과
    */
   public int insert(Goods goods){
	   // 배열의 길이 체크
	   if (count >= goodsArr.length) return -1;

	   //중복체크 
	   if (selectByCode(goods.getCode()) != null) return 0;
	  
	   //추가 성공
	   goodsArr[count++] = goods; return 1;
   }

   /**
    * 전체검색
    */
   public Goods[] selectAll() {
      return goodsArr;
   }

   /**
    * 상품코드에 해당하는 상품 검색
    * @return code에 해당하는 Goods를 리턴, 없으면 null 리턴
    */
   public Goods selectByCode(String code){
	   for (int i = 0; i < count; i++) {
			if (goodsArr[i].getCode().equals(code)) {
				return goodsArr[i];
			}
		}
		return null;
   }

   /**
    * 상품코드에 해당하는 가격, 설명 수정하기 
    * @return true이면 수정 완료, false이면 수정 실패
    */
   public boolean update(Goods goods){
		Goods findGoods = selectByCode(goods.getCode());
		if (findGoods == null) return false;
		else {
			findGoods.setPrice(goods.getPrice());
			findGoods.setExplain(goods.getExplain());
			return true;
		}
   }
   
   /**
    * 상품 삭제
    * @return true 삭제 성공, fals 삭제 실패
    */
   public boolean delete(String code) {
       for (int i = 0; i < count; i++) {
           if (goodsArr[i].getCode().equals(code)) {
               for (int j = i; j < count - 1; j++) {
                   goodsArr[j] = goodsArr[j + 1];
               }
               goodsArr[count - 1] = null;
               count--;
               return true;
           }
       }
       return false;
   }
}