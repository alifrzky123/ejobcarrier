package com.training.alif.geeksfarm.e_pohonkarrier.Entity;

import android.os.Parcel;
import android.os.Parcelable;

public class ListPekerjaan implements Parcelable {
    int imageFrontCard;
    String jobNames;
    String shortDesc;
    int imageDescCard;
    String gaji;
    String pendidikan;
    String sertifikat;
    String deskripsi;
    int imageWajibTahu;
    String sumberwjbtahu;
    String wajibtahu;
    String wajibtahu2;
    String wajibtahu3;
    String wajibtahu4;
    String wajibtahu5;
    String wajibtahu6;
    String wajibtahu7;
    String wajibtahu8;
    String wajibtahu9;
    String wajibtahuX;
    int imagePeran;
    String sumberimgperan;
    String PerandanTgg;
    int imagePengetahuan;
    String sumberPengetahuan;
    String pengetahuandanekeahlian;
    int imageJenjangKarrier;
    String sumberJenjang;
    String jenjang;
    int imgJurusan;
    String sumberimgjurusan;
    String jurusan;

    public ListPekerjaan(int imageFrontCard, String jobNames, String shortDesc, int imageDescCard, String gaji, String pendidikan, String sertifikat, String deskripsi, int imageWajibTahu, String sumberwjbtahu, String wajibtahu, String wajibtahu2, String wajibtahu3, String wajibtahu4, String wajibtahu5, String wajibtahu6, String wajibtahu7, String wajibtahu8, String wajibtahu9, String wajibtahuX, int imagePeran, String sumberimgperan, String perandanTgg, int imagePengetahuan, String sumberPengetahuan, String pengetahuandanekeahlian, int imageJenjangKarrier, String sumberJenjang, String jenjang, int imgJurusan, String sumberimgjurusan, String jurusan) {
        this.imageFrontCard = imageFrontCard;
        this.jobNames = jobNames;
        this.shortDesc = shortDesc;
        this.imageDescCard = imageDescCard;
        this.gaji = gaji;
        this.pendidikan = pendidikan;
        this.sertifikat = sertifikat;
        this.deskripsi = deskripsi;
        this.imageWajibTahu = imageWajibTahu;
        this.sumberwjbtahu = sumberwjbtahu;
        this.wajibtahu = wajibtahu;
        this.wajibtahu2 = wajibtahu2;
        this.wajibtahu3 = wajibtahu3;
        this.wajibtahu4 = wajibtahu4;
        this.wajibtahu5 = wajibtahu5;
        this.wajibtahu6 = wajibtahu6;
        this.wajibtahu7 = wajibtahu7;
        this.wajibtahu8 = wajibtahu8;
        this.wajibtahu9 = wajibtahu9;
        this.wajibtahuX = wajibtahuX;
        this.imagePeran = imagePeran;
        this.sumberimgperan = sumberimgperan;
        PerandanTgg = perandanTgg;
        this.imagePengetahuan = imagePengetahuan;
        this.sumberPengetahuan = sumberPengetahuan;
        this.pengetahuandanekeahlian = pengetahuandanekeahlian;
        this.imageJenjangKarrier = imageJenjangKarrier;
        this.sumberJenjang = sumberJenjang;
        this.jenjang = jenjang;
        this.imgJurusan = imgJurusan;
        this.sumberimgjurusan = sumberimgjurusan;
        this.jurusan = jurusan;
    }

    public int getImageFrontCard() {
        return imageFrontCard;
    }

    public String getJobNames() {
        return jobNames;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public int getImageDescCard() {
        return imageDescCard;
    }

    public String getGaji() {
        return gaji;
    }

    public String getPendidikan() {
        return pendidikan;
    }

    public String getSertifikat() {
        return sertifikat;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public int getImageWajibTahu() {
        return imageWajibTahu;
    }

    public String getSumberwjbtahu() {
        return sumberwjbtahu;
    }

    public String getWajibtahu() {
        return wajibtahu;
    }

    public String getWajibtahu2() {
        return wajibtahu2;
    }

    public String getWajibtahu3() {
        return wajibtahu3;
    }

    public String getWajibtahu4() {
        return wajibtahu4;
    }

    public String getWajibtahu5() {
        return wajibtahu5;
    }

    public String getWajibtahu6() {
        return wajibtahu6;
    }

    public String getWajibtahu7() {
        return wajibtahu7;
    }

    public String getWajibtahu8() {
        return wajibtahu8;
    }

    public String getWajibtahu9() {
        return wajibtahu9;
    }

    public String getWajibtahuX() {
        return wajibtahuX;
    }

    public int getImagePeran() {
        return imagePeran;
    }

    public String getSumberimgperan() {
        return sumberimgperan;
    }

    public String getPerandanTgg() {
        return PerandanTgg;
    }

    public int getImagePengetahuan() {
        return imagePengetahuan;
    }

    public String getSumberPengetahuan() {
        return sumberPengetahuan;
    }

    public String getPengetahuandanekeahlian() {
        return pengetahuandanekeahlian;
    }

    public int getImageJenjangKarrier() {
        return imageJenjangKarrier;
    }

    public String getSumberJenjang() {
        return sumberJenjang;
    }

    public String getJenjang() {
        return jenjang;
    }

    public int getImgJurusan() {
        return imgJurusan;
    }

    public String getSumberimgjurusan() {
        return sumberimgjurusan;
    }

    public String getJurusan() {
        return jurusan;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.imageFrontCard);
        dest.writeString(this.jobNames);
        dest.writeString(this.shortDesc);
        dest.writeInt(this.imageDescCard);
        dest.writeString(this.gaji);
        dest.writeString(this.pendidikan);
        dest.writeString(this.sertifikat);
        dest.writeString(this.deskripsi);
        dest.writeInt(this.imageWajibTahu);
        dest.writeString(this.sumberwjbtahu);
        dest.writeString(this.wajibtahu);
        dest.writeString(this.wajibtahu2);
        dest.writeString(this.wajibtahu3);
        dest.writeString(this.wajibtahu4);
        dest.writeString(this.wajibtahu5);
        dest.writeString(this.wajibtahu6);
        dest.writeString(this.wajibtahu7);
        dest.writeString(this.wajibtahu8);
        dest.writeString(this.wajibtahu9);
        dest.writeString(this.wajibtahuX);
        dest.writeInt(this.imagePeran);
        dest.writeString(this.sumberimgperan);
        dest.writeString(this.PerandanTgg);
        dest.writeInt(this.imagePengetahuan);
        dest.writeString(this.sumberPengetahuan);
        dest.writeString(this.pengetahuandanekeahlian);
        dest.writeInt(this.imageJenjangKarrier);
        dest.writeString(this.sumberJenjang);
        dest.writeString(this.jenjang);
        dest.writeInt(this.imgJurusan);
        dest.writeString(this.sumberimgjurusan);
        dest.writeString(this.jurusan);
    }

    protected ListPekerjaan(Parcel in) {
        this.imageFrontCard = in.readInt();
        this.jobNames = in.readString();
        this.shortDesc = in.readString();
        this.imageDescCard = in.readInt();
        this.gaji = in.readString();
        this.pendidikan = in.readString();
        this.sertifikat = in.readString();
        this.deskripsi = in.readString();
        this.imageWajibTahu = in.readInt();
        this.sumberwjbtahu = in.readString();
        this.wajibtahu = in.readString();
        this.wajibtahu2 = in.readString();
        this.wajibtahu3 = in.readString();
        this.wajibtahu4 = in.readString();
        this.wajibtahu5 = in.readString();
        this.wajibtahu6 = in.readString();
        this.wajibtahu7 = in.readString();
        this.wajibtahu8 = in.readString();
        this.wajibtahu9 = in.readString();
        this.wajibtahuX = in.readString();
        this.imagePeran = in.readInt();
        this.sumberimgperan = in.readString();
        this.PerandanTgg = in.readString();
        this.imagePengetahuan = in.readInt();
        this.sumberPengetahuan = in.readString();
        this.pengetahuandanekeahlian = in.readString();
        this.imageJenjangKarrier = in.readInt();
        this.sumberJenjang = in.readString();
        this.jenjang = in.readString();
        this.imgJurusan = in.readInt();
        this.sumberimgjurusan = in.readString();
        this.jurusan = in.readString();
    }

    public static final Parcelable.Creator<ListPekerjaan> CREATOR = new Parcelable.Creator<ListPekerjaan>() {
        @Override
        public ListPekerjaan createFromParcel(Parcel source) {
            return new ListPekerjaan(source);
        }

        @Override
        public ListPekerjaan[] newArray(int size) {
            return new ListPekerjaan[size];
        }
    };
}
