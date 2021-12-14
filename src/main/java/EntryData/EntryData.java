package EntryData;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "searchData")
@XmlAccessorType(XmlAccessType.FIELD)
public class EntryData {

    private String keyword;
    private String brandName;
    private String priceValidation;

    public String getKeyword() {
        return keyword;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getPriceValidation() {
        return priceValidation;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setPriceValidation(String priceValidation) {
        this.priceValidation = priceValidation;
    }

    @Override
    public String toString() {
        return "EntryData{" +
                "keyword='" + keyword + '\'' +
                ", brandName='" + brandName + '\'' +
                ", priceValidation='" + priceValidation + '\'' +
                ", brandName='" + brandName + '\'' +
                ", priceValidation='" + priceValidation + '\'' +
                '}';
    }

}
