package kamsheh.adam.project1calculator;

/**
 * Created by adam on 9/12/16.
 */
public class TrigOperations {

    private Units units = Units.RADIAN;

    public enum Units {
        DEGREE,
        RADIAN
    }

    public Units getUnits() {
        return this.units;
    }

    public void switchUnits() {
        if(this.units.equals(Units.DEGREE)) {
            this.units = Units.RADIAN;
        } else if(this.units.equals(Units.RADIAN)) {
            this.units = Units.DEGREE;
        }
    }

    public void switchUnits(String units) {
        //need to add if time
    }

    public double convertUnits(double state) {
        if(this.units.equals(Units.DEGREE)) {
            return Math.toDegrees(state);
        } else if(this.units.equals(Units.RADIAN)) {
            return Math.toRadians(state);
        }
        return -99;
    }

    public double sine(double state) {
        state = this.convertUnits(state);
        return Math.sin(state);
    }

    public double cosine(double state) {
        state = this.convertUnits(state);
        return Math.cos(state);
    }

    public double tangent(double state) {
        state = this.convertUnits(state);
        return Math.tan(state);
    }

    public double inverseSine(double state) {
        state = this.convertUnits(state);
        return Math.asin(state);
    }

    public double inverseCosine(double state) {
        state = this.convertUnits(state);
        return Math.acos(state);
    }

    public double inverseTangent(double state) {
        state = this.convertUnits(state);
        return Math.atan(state);
    }
}
