package com.swpu.uchain.openexperiment.redis;

/**
 * @Description
 * @Author cby
 * @Date 19-1-22
 **/
public class ProjectFileKey extends BasePrefix {
    public ProjectFileKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }

    public static ProjectFileKey projectFileKey = new ProjectFileKey(300, "file");
}