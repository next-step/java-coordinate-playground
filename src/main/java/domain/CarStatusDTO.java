package domain;

public class CarStatusDTO {
    private final String carName;
    private final int position;

    CarStatusDTO(String carName,int position){
        this.carName = carName;
        this.position = position;
    }

    public String getCarName(){
        return this.carName;
    }
    public int getPosition(){
        return this.position;
    }
}
