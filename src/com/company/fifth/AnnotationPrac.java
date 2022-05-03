package com.company.fifth;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 정의
@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo{
    String  testedBy() default "NoBody";
    int     findNumber() default 0;
}

// 선언
@TestInfo(testedBy = "DAMI", findNumber = 100)
class AnnotationPrac{
    public static void main(String args[]){
//        AnnotationPrac annotationPrac = new AnnotationPrac();
// 값 사용
        Class<AnnotationPrac> cls = AnnotationPrac.class;
        TestInfo testInfo;
        testInfo = (TestInfo)cls.getAnnotation(TestInfo.class);

        System.out.println(testInfo.testedBy());
        System.out.println(testInfo.findNumber());
    }
}