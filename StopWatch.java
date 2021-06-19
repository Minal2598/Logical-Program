package com.program;

public class StopWatch {
    long starts;

    @org.jetbrains.annotations.Contract(" -> new")
    public static TimeWatch start() {
        return new TimeWatch();
    }

    private StopWatch() {
        reset();
    }

    public TimeWatch reset() {
        starts = System.currentTimeMillis();
        return this;
    }

    public long time() {
        long ends = System.currentTimeMillis();
        return ends - starts;
    }

    public long time(TimeUnit unit) {
        return unit.convert(time(), TimeUnit.MILLISECONDS);
    }
}
