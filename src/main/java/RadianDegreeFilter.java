/**
 * Created by danzygmund-felt on 4/30/17.
 */
public class RadianDegreeFilter {
    private boolean isRadians;

    RadianDegreeFilter() {
        this.isRadians = true;
    }

    void setUnits() {
        this.isRadians = !this.isRadians;
    }

    void setUnits(String units) {
        if(units.equals("radians")) {
            this.isRadians = true;
        } else {
            this.isRadians = false;
        }
    }

    public double trigInputFilter(double x) {
        if(!this.isRadians) {
            return x * Math.PI / 180;
        } else {
            return x;
        }
    }

    public double trigOutputFilter(double x) {
        if(!this.isRadians) {
            return x * 180 / Math.PI;
        } else {
            return x;
        }
    }
}
