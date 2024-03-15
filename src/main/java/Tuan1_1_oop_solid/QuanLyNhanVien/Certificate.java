package Tuan1_1_oop_solid.QuanLyNhanVien;

public class Certificate {
    private int CertificatedID;
    private String CertificateName;
    private String CertificateRank;
    private int CertificatedDate;

    public Certificate(int certificatedID, String certificateName, String certificateRank, int certificatedDate) {
        CertificatedID = certificatedID;
        CertificateName = certificateName;
        CertificateRank = certificateRank;
        CertificatedDate = certificatedDate;
    }

    public int getCertificatedID() {
        return CertificatedID;
    }

    public void setCertificatedID(int certificatedID) {
        CertificatedID = certificatedID;
    }

    public String getCertificateName() {
        return CertificateName;
    }

    public void setCertificateName(String certificateName) {
        CertificateName = certificateName;
    }

    public String getCertificateRank() {
        return CertificateRank;
    }

    public void setCertificateRank(String certificateRank) {
        CertificateRank = certificateRank;
    }

    public int getCertificatedDate() {
        return CertificatedDate;
    }

    public void setCertificatedDate(int certificatedDate) {
        CertificatedDate = certificatedDate;
    }
}
