package com.lsy.LeetCodeCases;

import java.util.*;

class MergeIntervals {

    private class IntervalComparator implements Comparator<Interval> {

        @Override
        public int compare(Interval i1, Interval i2) {
            return i1.start - i2.start;
        }

    }

    public List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.size() <= 1) {
            return intervals;
        }
        LinkedList<Interval> list = new LinkedList<>();
        intervals.sort((Interval i1, Interval i2) -> {
            return i1.start - i2.start;
        });

        for (Interval interval : intervals) {
            if (list.isEmpty() || list.getLast().end < interval.start) {
                list.add(interval);
            } else {
                list.getLast().end = Math.max(list.getLast().end, interval.end);
            }
        }
        return list;
    }

    public static void main(String[] args) {

    }
}


