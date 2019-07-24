package com.manong.pojo;

import java.io.Serializable;

/**   
 * @ClassName:   WzckYwKc
 * @Description:TODO(物资库存)   
 * @author: xiaojs
 * @date:   2019年6月3日 下午1:32:16   
 *     
 */
public class WzckYwKc implements Serializable{
    /*
	 * @Description 
	 * @Param
	 * @return
	 */
	private static final long serialVersionUID = -8030492446738003558L;
	private String id;
    //单位代码 单位表
    private String kcDwdm;
    //单位名称 单位表
    private String kcDwmc;
    //物资代码
    private String kcWzdm;
    //物资名称
    private String kcWzmc;
    //物资用途代码
    private String kcWzytdm;
    //物资用途名称
    private String kcWzytmc;
    //物资数量
    private Integer kcWzsl;
    //量化代码
    private String kcWzlhdm;
    //量化名称
    private String kcWzlhmc;
    //备注
    private String kcBz;
    
    public WzckYwKc() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	public WzckYwKc(String id, String kcDwdm, String kcDwmc, String kcWzdm, String kcWzmc, String kcWzytdm,
			String kcWzytmc, Integer kcWzsl, String kcWzlhdm, String kcWzlhmc, String kcBz) {
		super();
		this.id = id;
		this.kcDwdm = kcDwdm;
		this.kcDwmc = kcDwmc;
		this.kcWzdm = kcWzdm;
		this.kcWzmc = kcWzmc;
		this.kcWzytdm = kcWzytdm;
		this.kcWzytmc = kcWzytmc;
		this.kcWzsl = kcWzsl;
		this.kcWzlhdm = kcWzlhdm;
		this.kcWzlhmc = kcWzlhmc;
		this.kcBz = kcBz;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getKcDwdm() {
        return kcDwdm;
    }

    public void setKcDwdm(String kcDwdm) {
        this.kcDwdm = kcDwdm == null ? null : kcDwdm.trim();
    }

    public String getKcDwmc() {
        return kcDwmc;
    }

    public void setKcDwmc(String kcDwmc) {
        this.kcDwmc = kcDwmc == null ? null : kcDwmc.trim();
    }

    public String getKcWzdm() {
        return kcWzdm;
    }

    public void setKcWzdm(String kcWzdm) {
        this.kcWzdm = kcWzdm == null ? null : kcWzdm.trim();
    }

    public String getKcWzmc() {
        return kcWzmc;
    }

    public void setKcWzmc(String kcWzmc) {
        this.kcWzmc = kcWzmc == null ? null : kcWzmc.trim();
    }

    public String getKcWzytdm() {
        return kcWzytdm;
    }

    public void setKcWzytdm(String kcWzytdm) {
        this.kcWzytdm = kcWzytdm == null ? null : kcWzytdm.trim();
    }

    public String getKcWzytmc() {
        return kcWzytmc;
    }

    public void setKcWzytmc(String kcWzytmc) {
        this.kcWzytmc = kcWzytmc == null ? null : kcWzytmc.trim();
    }

    public Integer getKcWzsl() {
        return kcWzsl;
    }

    public void setKcWzsl(Integer kcWzsl) {
        this.kcWzsl = kcWzsl;
    }

    public String getKcWzlhdm() {
        return kcWzlhdm;
    }

    public void setKcWzlhdm(String kcWzlhdm) {
        this.kcWzlhdm = kcWzlhdm == null ? null : kcWzlhdm.trim();
    }

    public String getKcWzlhmc() {
        return kcWzlhmc;
    }

    public void setKcWzlhmc(String kcWzlhmc) {
        this.kcWzlhmc = kcWzlhmc == null ? null : kcWzlhmc.trim();
    }

    public String getKcBz() {
        return kcBz;
    }

    public void setKcBz(String kcBz) {
        this.kcBz = kcBz == null ? null : kcBz.trim();
    }
}