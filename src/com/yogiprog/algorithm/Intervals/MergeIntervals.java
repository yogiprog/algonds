package com.yogiprog.algorithm.Intervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeIntervals {


    public List<Interval> merge(int[][] mat){

        List<Interval> list = new ArrayList<>();
        for(int i =0;i<mat.length;i++){

                Interval a = new Interval(mat[i][0],mat[i][1]);
                list.add(a);

        }

        for(Interval i : list){
            System.out.println(">>"+i.x+"--"+i.y);
        }

        Collections.sort(list);
        System.out.println(">>>after sort >>>");

        for(Interval i : list){
            System.out.println(">>"+i.x+"--"+i.y);
        }

        int j =1;
        while(j<=list.size()){
            Interval i1 = list.get(j-1);
            Interval i2 = list.get(j);
            if(i2.x < i1.y) {
                Interval interval  = new Interval(Math.min(i1.x,i2.x),Math.max(i1.y,i2.y));
                list.ad
                list.remove(j);
            }else{
                j++;
            }
        }


        System.out.println(">>>after interval >>>");

        for(Interval i : list){
            System.out.println(">>"+i.x+"--"+i.y);
        }
        return list;
    }


    class Interval implements Comparable<Interval>{
        int x;
        int y;
        Interval(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Interval o) {

            if(this.x==o.x)
                return  0;
            else if(this.x>o.x)
                return 1;
            else
                return -1;
        }
    }


    public static void main(String[] args) {
        MergeIntervals merge = new MergeIntervals();

        int[][] mat = {{7,9},{8,9},{1,2}};

        merge.merge(mat);


    }
}
