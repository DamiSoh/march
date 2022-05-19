package com.company.sixth;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinSum {
    static final ForkJoinPool pool = new ForkJoinPool();

    public static void main(String[] args) {
        long from = 0, to = 10;
        Sum sum = new Sum(from, to);

        Long result = pool.invoke(sum);
        System.out.println("total:" + result);
    }
}
class Sum extends RecursiveTask<Long> {
    private static final long serialVersionUID = 1L;
    long from, to;
    public Sum(long from, long to) {
        this.from = from;
        this.to = to;
    }
    public Long compute() {
        long size = to - from;
        // 더할 숫자가 적을 경우
        if(size <= 5) {
            long result = 0;
            for(long loop = from; loop <= to; loop++) {
                result += loop;
            }
            return result;
        }
        // 더할 숫자가 많을 경우
        // 두 개의 작업으로 나누어 동시에 실행시키고, 두 작업이 끝날 때 까지 결과를 기다림
        long half = (from + to) / 2;
        Sum leftSum = new Sum(from, half);
        leftSum.fork();
        Sum rightSum = new Sum(half + 1, to);
        return rightSum.compute() + leftSum.join();
    }
}











//    스터디에 메시지 보내기








