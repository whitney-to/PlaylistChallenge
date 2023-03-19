package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int lastInd = 0;
        int index = 0;
        for(String song : playList){
            if(song.equals(selection)){
                lastInd = index;
            }
            index++;
        }
        int result = Math.abs(startIndex-lastInd) < playList.length/2 ?
                Math.abs(startIndex-lastInd) : playList.length - Math.abs(startIndex-lastInd);
        return result;
    }

}
