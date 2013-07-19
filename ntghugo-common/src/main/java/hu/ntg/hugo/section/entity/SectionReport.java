package hu.ntg.hugo.section.entity;

import hu.ntg.hugo.common.AbstractEntity;
import java.util.Date;

/**
 *
 * @author kdeak
 */
public class SectionReport extends AbstractEntity {

    private int id;
    /**
     * JSON verzion
     */
    private String j_v;
    private int bk_id;
    /**
     * Map datasource version
     */
    private String map_v;
    /**
     * Relevant toll road identifier
     */
    private int toll_id;
    /**
     * Start of the trip
     */
    private Date t;
    /**
     * Server processed time
     */
    private Date processed_t;
    /**
     * Licence number
     */
    private String lic;
    /**
     * Nationality
     */
    private String nat;
    private String obu_id;
    /**
     * Number of axles
     */
    private int cat;
    /**
     * Factual section, 0=unfactual, 1=factual
     */
    private int fact;
    /**
     * Direction of movement, F - forward, B - backward
     */
    private String h;

    public SectionReport() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJ_v() {
        return j_v;
    }

    public void setJ_v(String j_v) {
        this.j_v = j_v;
    }

    public int getBk_id() {
        return bk_id;
    }

    public void setBk_id(int bk_id) {
        this.bk_id = bk_id;
    }

    public String getMap_v() {
        return map_v;
    }

    public void setMap_v(String map_v) {
        this.map_v = map_v;
    }

    public int getToll_id() {
        return toll_id;
    }

    public void setToll_id(int toll_id) {
        this.toll_id = toll_id;
    }

    public Date getT() {
        return t;
    }

    public void setT(Date t) {
        this.t = t;
    }

    public Date getProcessed_t() {
        return processed_t;
    }

    public void setProcessed_t(Date processed_t) {
        this.processed_t = processed_t;
    }

    public String getLic() {
        return lic;
    }

    public void setLic(String lic) {
        this.lic = lic;
    }

    public String getNat() {
        return nat;
    }

    public void setNat(String nat) {
        this.nat = nat;
    }

    public String getObu_id() {
        return obu_id;
    }

    public void setObu_id(String obu_id) {
        this.obu_id = obu_id;
    }

    public int getCat() {
        return cat;
    }

    public void setCat(int cat) {
        this.cat = cat;
    }

    public int getFact() {
        return fact;
    }

    public void setFact(int fact) {
        this.fact = fact;
    }

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }
}
