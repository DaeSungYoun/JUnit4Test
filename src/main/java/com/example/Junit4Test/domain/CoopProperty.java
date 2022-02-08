package com.example.Junit4Test.domain;


import lombok.Getter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "COUPONINFO_OUT", namespace = "http://gsapi.m2i.kr/")
public class CoopProperty {
    @XmlElement(name = "RESULTCODE", namespace = "http://gsapi.m2i.kr/")
    private String resultCode;

    @XmlElement(name = "RESULTMSG", namespace = "http://gsapi.m2i.kr/")
    private String resultMsg;

    @XmlElement(name = "COMP_NAME", namespace = "http://gsapi.m2i.kr/")
    private String compName;

    @XmlElement(name = "COUPONNAME", namespace = "http://gsapi.m2i.kr/")
    private String couponName;

    @XmlElement(name = "COMP_CODE", namespace = "http://gsapi.m2i.kr/")
    private String compCode;

    @XmlElement(name = "MENU_CODE", namespace = "http://gsapi.m2i.kr/")
    private String menuCode;

    @XmlElement(name = "USEPRICE", namespace = "http://gsapi.m2i.kr/")
    private String usePrice;

    @XmlElement(name = "SEL_PRICE", namespace = "http://gsapi.m2i.kr/")
    private String selPrice;

    @XmlElement(name = "USE_AREA", namespace = "http://gsapi.m2i.kr/")
    private String useArea;

    @XmlElement(name = "TAX_YN", namespace = "http://gsapi.m2i.kr/")
    private String taxYn;

    @XmlElement(name = "USE_LIMIT", namespace = "http://gsapi.m2i.kr/")
    private String useLimit;

    @XmlElement(name = "USE_NOTE", namespace = "http://gsapi.m2i.kr/")
    private String useNote;

    @XmlElement(name = "OUTTYPE", namespace = "http://gsapi.m2i.kr/")
    private String outType;

    @XmlElement(name = "USE_YN", namespace = "http://gsapi.m2i.kr/")
    private String useYn;

    @XmlElement(name = "OLD_PCODE", namespace = "http://gsapi.m2i.kr/")
    private String oldPcode;

    @XmlElement(name = "ADJ_PRICE", namespace = "http://gsapi.m2i.kr/")
    private String adjPrice;

    @XmlElement(name = "USE_TERM", namespace = "http://gsapi.m2i.kr/")
    private String useTerm;

    @XmlElement(name = "VAT_YN", namespace = "http://gsapi.m2i.kr/")
    private String vatYn;

    @XmlElement(name = "BASIC_IMG", namespace = "http://gsapi.m2i.kr/")
    private String basicImg;

    @XmlElement(name = "VIEW_IMG1", namespace = "http://gsapi.m2i.kr/")
    private String viewImg1;

    @XmlElement(name = "VIEW_IMG2", namespace = "http://gsapi.m2i.kr/")
    private String viewImg2;

    @XmlElement(name = "VIEW_IMG3", namespace = "http://gsapi.m2i.kr/")
    private String viewImg3;

    @XmlElement(name = "VIEW_IMG4", namespace = "http://gsapi.m2i.kr/")
    private String viewImg4;

    @XmlElement(name = "DET_IMG", namespace = "http://gsapi.m2i.kr/")
    private String detImg;

    @XmlElement(name = "FILLER01", namespace = "http://gsapi.m2i.kr/")
    private String filler01;

    @XmlElement(name = "FILLER02", namespace = "http://gsapi.m2i.kr/")
    private String filler02;

    @XmlElement(name = "FILLER03", namespace = "http://gsapi.m2i.kr/")
    private String filler03;

    @XmlElement(name = "FILLER04", namespace = "http://gsapi.m2i.kr/")
    private String filler04;

    @XmlElement(name = "J_COUPON", namespace = "http://gsapi.m2i.kr/")
    private String jCoupon;

//    @XmlElement(name = "IMAGE", namespace = "http://gsapi.m2i.kr/")
//    private CoopImage image;

    public void setBasicImg(String basicImg) {
        this.basicImg = basicImg;
    }

    public void setDetImg(String detImg) {
        this.detImg = detImg;
    }

//    public CoopLocation getLocation(){
//        return CoopLocation.builder()
//                .address("서울시 테헤란로 114길 38 (동일타워)")
//                .build();
//    }
//
//    public CoopInfo getInfo(){
//        return CoopInfo.builder()
//                .phone("15446240")
//                .build();
//    }
//
//    public CoopDescription getDescription(CoopProperty coopProperty){
//        return CoopDescription.builder()
//                .company(coopProperty.getCompName())
//                .notice(coopProperty.getUseNote())
//                .limit(coopProperty.getUseLimit())
//                .area(coopProperty.getUseArea())
//                .term(coopProperty.getUseTerm())
//                .build();
//    }
//
//    public String getTitle() {
//        return String.format("[법인상시]_%s_%s", couponName, LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
//    }
}
