
package tr.com.nuevo.dagger_rxandroid_database_mvp.mvp.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Cake {

    @SerializedName("detailDescription")
    private String mDetailDescription;
    @SerializedName("id")
    private Long mId;
    @SerializedName("image")
    private String mImage;
    @SerializedName("previewDescription")
    private String mPreviewDescription;
    @SerializedName("title")
    private String mTitle;

    public String getDetailDescription() {
        return mDetailDescription;
    }

    public void setDetailDescription(String detailDescription) {
        mDetailDescription = detailDescription;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getImage() {
        return mImage;
    }

    public void setImage(String image) {
        mImage = image;
    }

    public String getPreviewDescription() {
        return mPreviewDescription;
    }

    public void setPreviewDescription(String previewDescription) {
        mPreviewDescription = previewDescription;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

}
