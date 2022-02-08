package com.example.Junit4Test.domain;

import lombok.SneakyThrows;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CoopPropertyTest {

    @Test
    public void setBasicImg() {
        fail("개발중");
    }

    @Test
    public void setDetImg() {
        fail("개발중");
    }

    @Test
    public void getResultCode() throws JAXBException {
        //given
        JAXBContext jaxbContext = JAXBContext.newInstance(CoopProperty.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CoopProperty coopProperty = (CoopProperty) unmarshaller.unmarshal(new StringReader(CoopApiMockDummy.dummyCouponApiData));

        //whenR
        String resultCode = coopProperty.getResultCode();

        //then
        assertEquals("00", resultCode);
    }

    @Test
    public void getResultMsg() throws JAXBException {
        //given
        JAXBContext jaxbContext = JAXBContext.newInstance(CoopProperty.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CoopProperty coopProperty = (CoopProperty) unmarshaller.unmarshal(new StringReader(CoopApiMockDummy.dummyCouponApiData));

        //when
        String resultMsg = coopProperty.getResultMsg();

        //then
        assertEquals("처리완료", resultMsg);
    }

    @Test
    public void getCompName() throws JAXBException {
        //given
        JAXBContext jaxbContext = JAXBContext.newInstance(CoopProperty.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CoopProperty coopProperty = (CoopProperty) unmarshaller.unmarshal(new StringReader(CoopApiMockDummy.dummyCouponApiData));

        //when
        String compName = coopProperty.getCompName();

        //then
        assertEquals("투썸플레이스", compName);
    }

    @Test
    public void getCouponName() throws JAXBException {
        //given
        JAXBContext jaxbContext = JAXBContext.newInstance(CoopProperty.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CoopProperty coopProperty = (CoopProperty) unmarshaller.unmarshal(new StringReader(CoopApiMockDummy.dummyCouponApiData));

        //when
        String couponName = coopProperty.getCouponName();

        //then
        assertEquals("[투썸플레이스]아메리카노 R", couponName);
    }

    @Test
    public void getCompCode() throws JAXBException {
        //given
        JAXBContext jaxbContext = JAXBContext.newInstance(CoopProperty.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CoopProperty coopProperty = (CoopProperty) unmarshaller.unmarshal(new StringReader(CoopApiMockDummy.dummyCouponApiData));

        //when
        String compCode = coopProperty.getCompCode();

        //then
        assertEquals("CA47", compCode);
    }

    @SneakyThrows
    @Test
    public void getMenuCode() {
        //given
        JAXBContext jaxbContext = JAXBContext.newInstance(CoopProperty.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CoopProperty coopProperty = (CoopProperty) unmarshaller.unmarshal(new StringReader(CoopApiMockDummy.dummyCouponApiData));

        //when
        String menuCode = coopProperty.getMenuCode();

        //then
        assertEquals("29", menuCode);
    }

    @SneakyThrows
    @Test
    public void getUsePrice() {
        //given
        JAXBContext jaxbContext = JAXBContext.newInstance(CoopProperty.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CoopProperty coopProperty = (CoopProperty) unmarshaller.unmarshal(new StringReader(CoopApiMockDummy.dummyCouponApiData));

        //when
        String usePrice = coopProperty.getUsePrice();

        //then
        assertEquals("4100", usePrice);
    }

    @SneakyThrows
    @Test
    public void getSelPrice() {
        //given
        JAXBContext jaxbContext = JAXBContext.newInstance(CoopProperty.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CoopProperty coopProperty = (CoopProperty) unmarshaller.unmarshal(new StringReader(CoopApiMockDummy.dummyCouponApiData));

        //when
        String selPrice = coopProperty.getSelPrice();

        //then
        assertEquals("4100", selPrice);
    }

    @SneakyThrows
    @Test
    public void getUseArea() {
        //given
        JAXBContext jaxbContext = JAXBContext.newInstance(CoopProperty.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CoopProperty coopProperty = (CoopProperty) unmarshaller.unmarshal(new StringReader(CoopApiMockDummy.dummyCouponApiData));

        //when
        String useArea = coopProperty.getUseArea();

        //then
        assertEquals("테스트2", useArea);
    }

    @SneakyThrows
    @Test
    public void getTaxYn() {
        //given
        JAXBContext jaxbContext = JAXBContext.newInstance(CoopProperty.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CoopProperty coopProperty = (CoopProperty) unmarshaller.unmarshal(new StringReader(CoopApiMockDummy.dummyCouponApiData));

        //when
        String taxYn = coopProperty.getTaxYn();

        //then
        assertEquals("N", taxYn);
    }

    @SneakyThrows
    @Test
    public void getUseLimit() {
        //given
        JAXBContext jaxbContext = JAXBContext.newInstance(CoopProperty.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CoopProperty coopProperty = (CoopProperty) unmarshaller.unmarshal(new StringReader(CoopApiMockDummy.dummyCouponApiData));

        //when
        String useLimit = coopProperty.getUseLimit();

        //then
        assertEquals("테스트1", useLimit);
    }

    @SneakyThrows
    @Test
    public void getUseNote() {
        //given
        JAXBContext jaxbContext = JAXBContext.newInstance(CoopProperty.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CoopProperty coopProperty = (CoopProperty) unmarshaller.unmarshal(new StringReader(CoopApiMockDummy.dummyCouponApiData));

        //when
        String useNote = coopProperty.getUseNote();

        //then
        assertEquals("테스트3", useNote);
    }

    @SneakyThrows
    @Test
    public void getOutType() {
        //given
        JAXBContext jaxbContext = JAXBContext.newInstance(CoopProperty.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CoopProperty coopProperty = (CoopProperty) unmarshaller.unmarshal(new StringReader(CoopApiMockDummy.dummyCouponApiData));

        //when
        String outType = coopProperty.getOutType();

        //then
        assertEquals("011100", outType);
    }

    @SneakyThrows
    @Test
    public void getUseYn() {
        //given
        JAXBContext jaxbContext = JAXBContext.newInstance(CoopProperty.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CoopProperty coopProperty = (CoopProperty) unmarshaller.unmarshal(new StringReader(CoopApiMockDummy.dummyCouponApiData));

        //when
        String useYn = coopProperty.getUseYn();

        //then
        assertEquals("Y", useYn);
    }

    @SneakyThrows
    @Test
    public void getOldPcode() {
        //given
        JAXBContext jaxbContext = JAXBContext.newInstance(CoopProperty.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CoopProperty coopProperty = (CoopProperty) unmarshaller.unmarshal(new StringReader(CoopApiMockDummy.dummyCouponApiData));

        //when
        String oldPcode = coopProperty.getOldPcode();

        //then
        assertEquals("", oldPcode);
    }

    @SneakyThrows
    @Test
    public void getAdjPrice() {
        //given
        JAXBContext jaxbContext = JAXBContext.newInstance(CoopProperty.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CoopProperty coopProperty = (CoopProperty) unmarshaller.unmarshal(new StringReader(CoopApiMockDummy.dummyCouponApiData));

        //when
        String adjPrice = coopProperty.getAdjPrice();

        //then
        assertEquals("0", adjPrice);
    }

    @SneakyThrows
    @Test
    public void getUseTerm() {
        //given
        JAXBContext jaxbContext = JAXBContext.newInstance(CoopProperty.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CoopProperty coopProperty = (CoopProperty) unmarshaller.unmarshal(new StringReader(CoopApiMockDummy.dummyCouponApiData));

        //when
        String useTerm = coopProperty.getUseTerm();

        //then
        assertEquals("93", useTerm);
    }

    @SneakyThrows
    @Test
    public void getVatYn() {
        //given
        JAXBContext jaxbContext = JAXBContext.newInstance(CoopProperty.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CoopProperty coopProperty = (CoopProperty) unmarshaller.unmarshal(new StringReader(CoopApiMockDummy.dummyCouponApiData));

        //when
        String vatYn = coopProperty.getVatYn();

        //then
        assertEquals("Y", vatYn);
    }

    @SneakyThrows
    @Test
    public void getBasicImg() {
        //given
        JAXBContext jaxbContext = JAXBContext.newInstance(CoopProperty.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CoopProperty coopProperty = (CoopProperty) unmarshaller.unmarshal(new StringReader(CoopApiMockDummy.dummyCouponApiData));

        //when
        String basicImg = coopProperty.getBasicImg();

        //then
        assertEquals("/CA47/29/0001.jpg", basicImg);
    }

    @SneakyThrows
    @Test
    public void getViewImg1() {
        //given
        JAXBContext jaxbContext = JAXBContext.newInstance(CoopProperty.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CoopProperty coopProperty = (CoopProperty) unmarshaller.unmarshal(new StringReader(CoopApiMockDummy.dummyCouponApiData));

        //when
        String viewImg1 = coopProperty.getViewImg1();

        //then
        assertEquals("/CA47/29/0002.jpg", viewImg1);
    }

    @SneakyThrows
    @Test
    public void getViewImg2() {
        //given
        JAXBContext jaxbContext = JAXBContext.newInstance(CoopProperty.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CoopProperty coopProperty = (CoopProperty) unmarshaller.unmarshal(new StringReader(CoopApiMockDummy.dummyCouponApiData));

        //when
        String viewImg2 = coopProperty.getViewImg2();

        //then
        assertEquals("/CA47/29/0003.jpg", viewImg2);
    }

    @SneakyThrows
    @Test
    public void getViewImg3() {
        //given
        JAXBContext jaxbContext = JAXBContext.newInstance(CoopProperty.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CoopProperty coopProperty = (CoopProperty) unmarshaller.unmarshal(new StringReader(CoopApiMockDummy.dummyCouponApiData));

        //when
        String viewImg3 = coopProperty.getViewImg3();

        //then
        assertEquals("/CA47/29/0004.jpg", viewImg3);
    }

    @SneakyThrows
    @Test
    public void getViewImg4() {
        //given
        JAXBContext jaxbContext = JAXBContext.newInstance(CoopProperty.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CoopProperty coopProperty = (CoopProperty) unmarshaller.unmarshal(new StringReader(CoopApiMockDummy.dummyCouponApiData));

        //when
        String viewImg4 = coopProperty.getViewImg4();

        //then
        assertEquals("/CA47/29/0005.jpg", viewImg4);
    }

    @SneakyThrows
    @Test
    public void getDetImg() {
        //given
        JAXBContext jaxbContext = JAXBContext.newInstance(CoopProperty.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CoopProperty coopProperty = (CoopProperty) unmarshaller.unmarshal(new StringReader(CoopApiMockDummy.dummyCouponApiData));

        //when
        String detImg = coopProperty.getDetImg();

        //then
        assertEquals("/CA47/29/0006.jpg", detImg);
    }

    @SneakyThrows
    @Test
    public void getFiller01() {
        //given
        JAXBContext jaxbContext = JAXBContext.newInstance(CoopProperty.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CoopProperty coopProperty = (CoopProperty) unmarshaller.unmarshal(new StringReader(CoopApiMockDummy.dummyCouponApiData));

        //when
        String filler01 = coopProperty.getFiller01();

        //then
        assertEquals("", filler01);
    }

    @SneakyThrows
    @Test
    public void getFiller02() {
        //given
        JAXBContext jaxbContext = JAXBContext.newInstance(CoopProperty.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CoopProperty coopProperty = (CoopProperty) unmarshaller.unmarshal(new StringReader(CoopApiMockDummy.dummyCouponApiData));

        //when
        String filler02 = coopProperty.getFiller02();

        //then
        assertEquals("", filler02);
    }

    @SneakyThrows
    @Test
    public void getFiller03() {
        //given
        JAXBContext jaxbContext = JAXBContext.newInstance(CoopProperty.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CoopProperty coopProperty = (CoopProperty) unmarshaller.unmarshal(new StringReader(CoopApiMockDummy.dummyCouponApiData));

        //when
        String filler03 = coopProperty.getFiller03();

        //then
        assertEquals("", filler03);
    }

    @SneakyThrows
    @Test
    public void getFiller04() {
        //given
        JAXBContext jaxbContext = JAXBContext.newInstance(CoopProperty.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CoopProperty coopProperty = (CoopProperty) unmarshaller.unmarshal(new StringReader(CoopApiMockDummy.dummyCouponApiData));

        //when
        String filler04 = coopProperty.getFiller04();

        //then
        assertEquals("", filler04);
    }

    @SneakyThrows
    @Test
    public void getJCoupon() {
        //given
        JAXBContext jaxbContext = JAXBContext.newInstance(CoopProperty.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CoopProperty coopProperty = (CoopProperty) unmarshaller.unmarshal(new StringReader(CoopApiMockDummy.dummyCouponApiData));

        //when
        String jCoupon = coopProperty.getJCoupon();

        //then
        assertEquals("N", jCoupon);
    }

    @Test
    public void getImage() {
        fail("개발중");
    }
}
