package Source;

public class Optional {
//    for 4 parametrs
    public int getBucketCount(double width,double higth,double areaPerBucket,int extraBucket){
        if(width<=0){
            return -1;
        }
        if(higth<=0){
            return -1;
        }
        if(areaPerBucket<=0){
            return -1;
        }
        double result=((width*higth)/areaPerBucket);
        result=Math.ceil(result);
        return (int)result-extraBucket;
    }
// For 3 paramets
    public int getBucketCount(double width,double higth,double areaPerBucket){
        if(width<=0){
            return -1;
        }
        if(higth<=0){
            return -1;
        }
        if(areaPerBucket<=0){
            return -1;
        }
        double result=((width*higth)/areaPerBucket);
        result=Math.ceil(result);
        return (int)result;
    }
//    for 2 parametrs
    public int getBucketCount(double areaWall,double areaPerBucket){
        if(areaWall<=0){
            return -1;
        }
        if(areaPerBucket<=0){
            return -1;
        }
        double result=((areaWall)/areaPerBucket);
        result=Math.ceil(result);
        return (int)result;
    }
}
