package com.permata.appraisal.common;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public final class AppConstans {

    private AppConstans() {
    }

    public static final class Role911 {
        public static final String USER_ID = "911";
    }

    public static final class HibernateConstanstan {
        public static final String PREFIX_DB_NAME = "";
    }

    public static final class SecurityLogConstans {
        public static final Long LOGIN_SUCCESS   = 1l;
        public static final Long LOGIN_FAILURE   = 2l;
        public static final Long LOGOUT   = 3l;
        public static final Long USER_PROFILE_CREATION   = 4l;
        public static final Long USER_PROFILE_ACTIVATION   = 5l;
        public static final Long USER_PROFILE_DEACTIVATION   = 6l;
        public static final Long USER_PROFILE_DELETION   = 7l;
        public static final Long USER_PROFILE_UNDELETE   = 8l;
        public static final Long USER_PROFILE_RENAMING   = 9l;
        public static final Long USER_PROFILE_CHANGE    = 10l;

        public static final Long USER_ROLES_ADD  = 11l;
        public static final Long USER_ROLES_REMOVED   = 12l;
        public static final Long USER_ROLES_CHANGE  = 13l;
        public static final Long SYSTEM_PARAMETER_CHANGE   = 14l;
        public static final Long UNAUTHORIZE_ACCESS   = 15l;
        public static final Long LOGOUT_SESSION_EXPIRED   = 16l;
    }

    public static final String APP_NAME = "Web Appraisal";

    public static class MataUang {
        public static final String IDR = "IDR";
    }

    public static class JenisKategoriCode {
        public static final String LNB = "category1";
        public static final String KENDARAAN = "category2";
        public static final String MESIN = "category3";
        public static final String STOCK = "category4";
        public static final String VESEL = "category5";
        public static final String INSPEKSI = "category6";
    }



    public static class SourceStatusConstans {
        public static final Integer MARKETING_TO_ADMIN   = 1;
        public static final Integer ADMIN_CLAIM   = 2;
        public static final Integer APPROVAL_CLOSE   = 3;
        public static final Integer REJECT_TO_MARKETING   = 6;
        public static final Integer SUCCESS_SEND   = 4;
        public static final Integer FAILED_SEND   = 5;
        public static final Integer FAIL_RESEND_MANUAL   = 7;
        public static final Integer FAILED_SEND_REJECT   = 8;

        public static final String SUCCESS_SEND_ORDER_CARM   = "00";
        public static final String SUCCESS_SEND_ATTACH_CARM   = "00";
        public static final String SUCCESS_SEND_REJECT_CARM   = "00";




    }

    public static class JenisLaporan {
        public static final String NEW = "New";
        public static final String REAPPRAISE = "Reappraise";
        public static final String REVISI = "Revisi";
        public static final String ESKALASI = "Eskalasi";
        public static final String RWA = "RWA";

        public static final String[] options = new String[]{NEW, REAPPRAISE, REVISI, ESKALASI, RWA};

        public static final List<String> getList() {
            return Arrays.asList(options);
        }
    }

    public static class JenisAppraisalCategory {
        public static final String INTERNAL = "Internal";
        public static final String EKSTERNAL = "Eksternal";
    }

    public static class JenisAppraisalName {
        public static final String RAB = "Review RAB";
        public static final String BV = "BV";
        public static final String RV = "RV";
        public static final String APPRAISAL = "Appraisal";
        public static final String DESKTOP = "Desktop";
    }

    public static class OrderDataCommon {
        public static final String ORDER_CODE = "-ORDER";
        public static final String LPA_CODE = "-LPA";
        public static final String ORDER_PATTERN = "%s%05d";
        public static final String DATE_ORDER_PATTERN = "yyyyMMdd";

        public static final String getOrderPattern() {
            SimpleDateFormat sdf = new SimpleDateFormat(DATE_ORDER_PATTERN);
            return sdf.format(new Date());
        }
    }

    public final class ControllerConstants {
        public static final String DATE_CONVERTER_PATTERN = "dd-MM-yyyy";
    }

    public final class TaskPosition {
        public static final String DROP             = "DROP";
        public static final String USER_TL          = "User_TL";
        public static final String APP_ADMIN        = "App_Admin";
        public static final String APP_VALUER       = "App_Valuer";
        public static final String APP_SURVEYOR     = "App_Surveyor";
        public static final String APP_APPROVAL     = "App_Approval";
        public static final String CLOSE = "CLOSE";
    }

    public static final class GroupParameter {
        public static final String BENTUK_TANAH = "BENTUK_TANAH_FISIK";
        public static final String KONTUR_TANAH = "KONTUR_TANAH";
        public static final String KETINGGIAN_TANAH = "KETINGGIAN_TANAH";
        public static final String SESUAI_BATAS_TANAH = "SESUAI_BATAS_TANAH";
        public static final String POSISI_TANAH = "POSISI_TANAH";
        public static final String KONDISI_TANAH = "KONDISI_TANAH";
        public static final String JENIS_TANAH = "JENIS_TANAH";
        public static final String KELAS_BANGUNAN = "KELAS_BANGUNAN";
        public static final String KEPADATAN_PENDUDUK = "KEPADATAN_PENDUDUK";
        public static final String TINGKAT_KEMACETAN = "TINGKAT_KEMACETAN";
        public static final String JENIS_AKTIVA = "JENIS_AKTIVA";
        public static final String KONDISI_DENGAN_AKTIVA = "KONDISI_DENGAN_AKTIVA";
        public static final String NEGATIVE_LIST = "NEGATIVE_LIST";
        public static final String NEGATIVE_LIST_KENDARAAN = "NEGATIVE_LIST_KENDARAAN";
        public static final String PROPERTI_PERTIMBANGAN = "PROPERTI_PERTIMBANGAN";
        public static final String PROPERTI_PERTIMBANGAN_KENDARAAN = "PROPERTI_PERTIMBANGAN_KENDARAAN";
        public static final String REJECT_CATEGORY = "REJECT_CATEGORY";
        //        public static final String SURVEY_IMAGE_CATEGORY = "SURVEY_IMAGE_CATEGORY";
        // public static final String JENIS_OBJECT_PENILAIAN = "JENIS_OBJECT_PENILAIAN";
        public static final String JENIS_OBJECT_PENILAIAN_KENDARAAN = "JENIS_OBJECT_PENILAIAN_KENDARAAN";
        public static final String POSISI_LOKASI_AKTIVA = "POSISI_LOKASI_AKTIVA";
        public static final String PERUNTUKAN_BANGUNAN = "PERUNTUKAN_BANGUNAN";
        public static final String PERUNTUKAN_TANAH = "PERUNTUKAN_TANAH";
        public static final String JENIS_BANGUNAN = "JENIS_BANGUNAN";
        public static final String LINGKUNGAN_SEKITAR = "LINGKUNGAN_SEKITAR";
        public static final String DIGUNAKAN_SEBAGAI = "DIGUNAKAN_SEBAGAI";
        public static final String DIGUNAKAN_SEBAGAI_KENDARAAN = "DIGUNAKAN_SEBAGAI_KENDARAAN";
        public static final String DIHUNI_OLEH = "DIHUNI_OLEH";
        //        public static final String JENIS_PENILAIAN_FISIK = "JENIS_PENILAIAN_FISIK";
        public static final String CATEGORY_SLA_AGUNAN = "CATEGORY_SLA_AGUNAN";
        public static final String IJIN_SESUAI_IMB = "IJIN_SESUAI_IMB";
        public static final String STATUS_AGUNAN_DISEWAKAN = "STATUS_AGUNAN_DISEWAKAN";
        public static final String PROSES_PEMBANGUNAN = "PROSES_PEMBANGUNAN";
        public static final String STATUS_BANGUNAN = "STATUS_BANGUNAN";
        public static final String FAKTOR_MARKETABILITY = "FAKTOR_MARKETABILITY";
        public static final String FAKTOR_UNMARKETABILITY = "FAKTOR_UNMARKETABILITY";
        public static final String CATATAN_KEWAJARAN = "CATATAN_KEWAJARAN";
        public static final String CATATAN_KESESUAIAN ="CATATAN_KESESUAIAN";
        // public static final String JENIS_PENILAIAN_FISIK_KENDARAAN = "JENIS_PENILAIAN_FISIK_KENDARAAN";
        public static final String PENGGUNAAN_KENDARAAN = "PENGGUNAAN_KENDARAAN";
        //        public static final String SURVEY_IMAGE_CATEGORY_KENDARAAN = "SURVEY_IMAGE_CATEGORY_KENDARAAN";
//        public static final String SURVEY_IMAGE_CATEGORY_STOCK = "SURVEY_IMAGE_CATEGORY_STOCK";
        public static final String PENEMPATAN_BARANG = "PENEMPATAN_BARANG";
        public static final String KEMASAN_BARANG = "KEMASAN_BARANG";
        public static final String KONDISI_BARANG = "KONDISI_BARANG";
        public static final String METODE_PEMERIKSAAN = "METODE_PEMERIKSAAN";
        public static final String JUMLAH_PERSEDIAAN = "JUMLAH_PERSEDIAAN";
        public static final String TEMPAT_PENYIMPANAN = "TEMPAT_PENYIMPANAN";
        public static final String KONDISI_PENYIMPANAN = "KONDISI_PENYIMPANAN";
        public static final String LINGKUNGAN_PENYIMPANAN = "LINGKUNGAN_PENYIMPANAN";
        public static final String PERALATAN_GUDANG = "PERALATAN_GUDANG";
        public static final String FAKTOR_UNMARKETABILITY_STOCK = "FAKTOR_UNMARKETABILITY_STOCK";
        public static final String PROPERTI_PERTIMBANGAN_STOCK = "PROPERTI_PERTIMBANGAN_STOCK";
        public static final String NEGATIVE_LIST_STOCK = "NEGATIVE_LIST_STOCK";
        public static final String OPINI_INTERNAL_ATAS_EKSTERNAL = "OPINI_INTERNAL_ATAS_EKSTERNAL";
        public static final String KONDISI_BODY_KENDARAAN = "KONDISI_BODY_KENDARAAN";
        public static final String KONDISI_CAT_KENDARAAN = "KONDISI_CAT_KENDARAAN";
        public static final String KONDISI_BUMPER_KENDARAAN = "KONDISI_BUMPER_KENDARAAN";
        public static final String KONDISI_INTERIOR_KENDARAAN = "KONDISI_INTERIOR_KENDARAAN";
        public static final String KONDISI_EKSTERIOR_KENDARAAN = "KONDISI_EKSTERIOR_KENDARAAN";
        public static final String KONDISI_MESIN_KENDARAAN = "KONDISI_MESIN_KENDARAAN";
        public static final String KONDISI_BAN_KENDARAAN = "KONDISI_BAN_KENDARAAN";
        public static final String FAKTOR_UNMARKETABILITY_KENDARAAN = "FAKTOR_UNMARKETABILITY_KENDARAAN";
        public static final String PEMAKAIAN_KENDARAAN = "PEMAKAIAN_KENDARAAN";
        public static final String PROSENTASE_LIKUIDASI = "PROSENTASE_LIKUIDASI";
        public static final String BV_KEGIATAN_USAHA = "BV_KEGIATAN_USAHA";
        public static final String BV_SI1_HUBUNGAN = "BV_SI1_HUBUNGAN";
        public static final String BV_SI2_HUBUNGAN = "BV_SI2_HUBUNGAN";
        public static final String BV_SI3_HUBUNGAN = "BV_SI3_HUBUNGAN";
        public static final String BV_STATUS_KEPEMILIKAN_USAHA = "BV_STATUS_KEPEMILIKAN_USAHA";
        public static final String BV_STATUS_LOKASI_USAHA = "BV_STATUS_LOKASI_USAHA";
        public static final String BV_FASILITAS = "BV_FASILITAS";
        public static final String BV_JENIS_BANGUNAN = "BV_JENIS_BANGUNAN";
        public static final String BV_LUAS_TANAH = "BV_LUAS_TANAH";
        public static final String BV_LUAS_BANGUNAN = "BV_LUAS_BANGUNAN";
        public static final String BV_JALAN_TEMPAT_USAHA = "BV_JALAN_TEMPAT_USAHA";
        public static final String BV_LINGKUNGAN_SEKITAR = "BV_LINGKUNGAN_SEKITAR";
        public static final String BV_LAMA_PENEMPATAN = "BV_LAMA_PENEMPATAN";
        public static final String BV_JENIS_USAHA = "BV_JENIS_USAHA";
        public static final String BV_OMZET_PENJUALAN = "BV_OMZET_PENJUALAN";
        public static final String BV_JUMLAH_KARYAWAN = "BV_JUMLAH_KARYAWAN";
        public static final String BV_DITERIMA_DI = "BV_DITERIMA_DI";
        public static final String BV_FOTO_PADA = "BV_FOTO_PADA";
        public static final String RV_LIST_UMUR_APLIKAN = "RV_LIST_UMUR_APLIKAN";
        public static final String RV_SI1_HUBUNGAN = "RV_SI1_HUBUNGAN";
        public static final String RV_SI2_HUBUNGAN = "RV_SI2_HUBUNGAN";
        public static final String RV_SI3_HUBUNGAN = "RV_SI3_HUBUNGAN";
        public static final String RV_DITERIMA_DI = "RV_DITERIMA_DI";
        public static final String RV_PENGHUNI = "RV_PENGHUNI";
        public static final String RV_LINGKUNGAN_SEKITAR = "RV_LINGKUNGAN_SEKITAR";
        public static final String RV_JENIS_BANGUNAN = "RV_JENIS_BANGUNAN";
        public static final String RV_LUAS_BANGUNAN = "RV_LUAS_BANGUNAN";
        public static final String RV_LUAS_TANAH = "RV_LUAS_TANAH";
        public static final String RV_STATUS_KEPEMILIKAN = "RV_STATUS_KEPEMILIKAN";
        public static final String RV_LAMA_PENEMPATAN = "RV_LAMA_PENEMPATAN";
        public static final String RV_DATANG_DEBTCOLLECTOR = "RV_DATANG_DEBTCOLLECTOR";
        public static final String RV_FOTO_PADA = "RV_FOTO_PADA";
        public static final String MESIN_FAKTOR_MARKETABILITY = "MESIN_FAKTOR_MARKETABILITY";
        public static final String MESIN_NEGATIVE_LIST = "MESIN_NEGATIVE_LIST";
        public static final String MESIN_PERTIMBANGAN = "MESIN_PERTIMBANGAN";
        public static final String MESIN_FAKTOR_UNMARKETABILITY = "MESIN_FAKTOR_UNMARKETABILITY";
        public static final String MESIN_TEMPAT = "MESIN_TEMPAT";
        public static final String MESIN_KONDISI_TEMPAT = "MESIN_KONDISI_TEMPAT";
        public static final String MESIN_LINGKUNGAN_SEKITAR = "MESIN_LINGKUNGAN_SEKITAR";
        public static final String MESIN_TEKNISI = "MESIN_TEKNISI";
        public static final String MESIN_SUKU_CADANG = "MESIN_SUKU_CADANG";
        public static final String MESIN_KONDISI = "MESIN_KONDISI";
        public static final String MESIN_RANGKAIAN = "MESIN_RANGKAIAN";
        public static final String MESIN_PENGGUNAAN = "MESIN_PENGGUNAAN";
        public static final String NEGATIVE_LIST_VESSEL = "NEGATIVE_LIST_VESSEL";
        public static final String PROPERTI_PERTIMBANGAN_VESSEL = "PROPERTI_PERTIMBANGAN_VESSEL";
        public static final String KELAS_KAPAL_VESSEL = "KELAS_KAPAL_VESSEL";
        public static final String STATUS_AGUNAN_VESSEL = "STATUS_AGUNAN_VESSEL";
        public static final String STATUS_JAMINAN_VESSEL = "STATUS_JAMINAN_VESSEL";
        public static final String KONDISI_UMUM_VESSEL = "KONDISI_UMUM_VESSEL";
        public static final String JENIS_VESSEL = "JENIS_VESSEL";
        public static final String RAB_KEWAJARAN_NILAI = "RAB_KEWAJARAN_NILAI";
        //Start Inspeksi
        public static final String INSPEKSI_JENIS_TEMPAT_SIMPAN = "INSPEKSI_JENIS_TEMPAT_SIMPAN";
        public static final String INSPEKSI_INFO_ALAMAT_TEMPAT = "INSPEKSI_INFO_ALAMAT_TEMPAT";
        public static final String INSPEKSI_STATUS_TEMPAT_SIMPAN = "INSPEKSI_STATUS_TEMPAT_SIMPAN";
        public static final String INSPEKSI_KODISI_TEMPAT_SIMPAN = "INSPEKSI_KODISI_TEMPAT_SIMPAN";
        public static final String INSPEKSI_AKTIFITAS_KERJA = "INSPEKSI_AKTIFITAS_KERJA";
        public static final String INSPEKSI_PERALATAN_GUDANG = "INSPEKSI_PERALATAN_GUDANG";
        public static final String INSPEKSI_ALAT_PEMADAM = "INSPEKSI_ALAT_PEMADAM";
        public static final String INSPEKSI_KEAMANAN = "INSPEKSI_KEAMANAN";
        public static final String INSPEKSI_KONDISI_JALAN = "INSPEKSI_KONDISI_JALAN";
        public static final String INSPEKSI_LINGKUNGAN_SEKITAR = "INSPEKSI_LINGKUNGAN_SEKITAR";
        public static final String INSPEKSI_METODE_PERIKSA = "INSPEKSI_METODE_PERIKSA";
        public static final String INSPEKSI_PENEMPATAN_PERSEDIAAN = "INSPEKSI_PENEMPATAN_PERSEDIAAN";
        public static final String INSPEKSI_SUSUSNAN_PENEMPATAN = "INSPEKSI_SUSUSNAN_PENEMPATAN";
        public static final String INSPEKSI_PACKING = "INSPEKSI_PACKING";
        //end Inspeksi

    }

    public final class ErrorMessage {
        public static final String CODE_REQUIRED = "required";
        public static final String MSG_REQUIRED = "%s must not empty";
    }

    public final class Source {
        public static final String CARM = "CARM";
        public static final String PLUS = "PLUS";
        public static final String RWA = "RWA";
    }

    public final class SystemParamCode {
        // RWA Proses
        public static final String RWA_FILE_NAME = "RWA_FILE_NAME";
        public static final String RWA_PROSES = "RWA_PROSES";
        public static final String RWA_PROSES_MSG = "RWA_PROSES_MSG";
        public static final String RWA_PROSES_DATE = "RWA_PROSES_DATE";
        public static final String RWA_TANGGAL_RESET = "RWA_TANGGAL_RESET";
        public static final String RWA_WS_USER = "RWA_WS_USER";
        public static final String RWA_WS_PASSWORD = "RWA_WS_PASSWORD";
        public static final String RWA_DOWN_DATE = "RWA_DOWN_DATE";
        public static final String RWA_FTP_DIR = "RWA_FTP_DIR";
        public static final String RWA_FTP_IP = "RWA_FTP_IP";
        public static final String RWA_FTP_PASSWORD = "RWA_FTP_PASSWORD";
        public static final String RWA_FTP_PORT = "RWA_FTP_PORT";
        public static final String RWA_FTP_USER = "RWA_FTP_USER";
        public static final String RWA_TIMEOUT_WS = "RWA_TIMEOUT_WS";
        public static final String RWA_TIMEOUT_FTP = "RWA_TIMEOUT_FTP";
        public static final String RWA_TIMEOUT_READ_FILE = "RWA_TIMEOUT_READ_FILE";
        public static final String RWA_WS_IP_SEND = "RWA_WS_IP_SEND";
        public static final String RWA_WS_IP_RECV = "RWA_WS_IP_RECV";


        // upload kode pos
        public static final String ZIP_CODE_FTP_FILE = "ZIP_CODE_FTP_FILE";
        public static final String ZIP_CODE_FTP_DIR = "ZIP_CODE_FTP_DIR";
        public static final String ZIP_CODE_FTP_USER = "ZIP_CODE_FTP_USER";
        public static final String ZIP_CODE_FTP_PASSWORD = "ZIP_CODE_FTP_PASSWORD";
        public static final String ZIP_CODE_FTP_IP = "ZIP_CODE_FTP_IP";
        public static final String ZIP_CODE_FTP_PORT = "ZIP_CODE_FTP_PORT";

        public static final String PLUS_CLIENT_URL = "PLUS_CLIENT_URL";
    }

    public final class StatusOrder {
        public static final int INIT = 0;
        public static final int COMPLETE_ATTCH = 1;
        public static final int ADMIN_CLAIM = 2;
        public static final int CLOSE = 3;
        public static final int SUCCESS_SEND = 4;
        public static final int FAIL_SEND = 5;
        public static final int REJECT = 6;
        public static final int FAIL_RESEND = 7;
        public static final int FAIL_REJECT = 8;
    }
}