package edu.hhu.stonk.spark.task;

import edu.hhu.stonk.spark.datafile.DataFile;

import java.io.Serializable;

/**
 * 任务
 *
 * @author hayes, @create 2017-12-11 19:38
 **/
public class SparkTaskInfo implements Serializable {

    private static final long serialVersionUID = 5977076348345628864L;
    /**
     * SparkTaskInfo Name
     */
    private String name;

    /**
     * 用户 name
     */
    private String uname;

    /**
     * 数据集
     */
    private DataFile dataFile;

    /**
     * Executor Num
     */
    private int sparkExecutorNum = 1;

    /**
     * 算法信息
     */
    private TaskMLalgorithm mlAlgorithm;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public DataFile getDataFile() {
        return dataFile;
    }

    public void setDataFile(DataFile dataFile) {
        this.dataFile = dataFile;
    }

    public TaskMLalgorithm getMlAlgorithm() {
        return mlAlgorithm;
    }

    public void setMlAlgorithm(TaskMLalgorithm mlAlgorithm) {
        this.mlAlgorithm = mlAlgorithm;
    }

    public int getSparkExecutorNum() {
        return sparkExecutorNum;
    }

    public void setSparkExecutorNum(int sparkExecutorNum) {
        this.sparkExecutorNum = sparkExecutorNum;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}