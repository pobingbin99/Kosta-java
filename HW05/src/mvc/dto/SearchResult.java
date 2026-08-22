package mvc.dto;

public class SearchResult {
    private ResultType resultType;
    private Profile profile;

    public SearchResult(ResultType resultType, Profile profile) {
        this.resultType = resultType;
        this.profile = profile;
    }

    public ResultType getResultType() {
        return resultType;
    }

    public Profile getProfile() {
        return profile;
    }
}