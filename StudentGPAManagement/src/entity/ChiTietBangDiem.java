package entity;

public class ChiTietBangDiem {
 private MonHoc monHoc;
 private double diem;
public MonHoc getMonHoc() {
	return monHoc;
}
public void setMonHoc(MonHoc monHoc) {
	this.monHoc = monHoc;
}
public double getDiem() {
	return diem;
}
public void setDiem(double diem) {
	this.diem = diem;
}
 
@Override
public String toString() {
    return "BangDiemChiTiet{" +
            "tenMon=" + monHoc.getTenMon() +
            ", điểm=" + diem +
            '}';
}


 
 
}
