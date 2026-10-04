package r1;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import b1.AbstractC0703b;
import f1.AbstractC0870c;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* renamed from: r1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1868g {

    /* renamed from: A, reason: collision with root package name */
    public static final byte[] f14821A;

    /* renamed from: B, reason: collision with root package name */
    public static final String[] f14822B;

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f14823C;

    /* renamed from: D, reason: collision with root package name */
    public static final byte[] f14824D;

    /* renamed from: E, reason: collision with root package name */
    public static final C1865d f14825E;

    /* renamed from: F, reason: collision with root package name */
    public static final C1865d[][] f14826F;

    /* renamed from: G, reason: collision with root package name */
    public static final C1865d[] f14827G;

    /* renamed from: H, reason: collision with root package name */
    public static final HashMap[] f14828H;
    public static final HashMap[] I;
    public static final HashSet J;

    /* renamed from: K, reason: collision with root package name */
    public static final HashMap f14829K;

    /* renamed from: L, reason: collision with root package name */
    public static final Charset f14830L;

    /* renamed from: M, reason: collision with root package name */
    public static final byte[] f14831M;

    /* renamed from: N, reason: collision with root package name */
    public static final byte[] f14832N;

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f14833l = Log.isLoggable("ExifInterface", 3);

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f14834m;

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f14835n;

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f14836o;

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f14837p;

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f14838q;

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f14839r;

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f14840s;

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f14841t;

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f14842u;

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f14843v;

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f14844w;

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f14845x;

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f14846y;

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f14847z;
    public final FileDescriptor a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager.AssetInputStream f14848b;

    /* renamed from: c, reason: collision with root package name */
    public int f14849c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap[] f14850d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f14851e;

    /* renamed from: f, reason: collision with root package name */
    public ByteOrder f14852f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14853g;

    /* renamed from: h, reason: collision with root package name */
    public int f14854h;

    /* renamed from: i, reason: collision with root package name */
    public int f14855i;

    /* renamed from: j, reason: collision with root package name */
    public int f14856j;

    /* renamed from: k, reason: collision with root package name */
    public int f14857k;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f14834m = new int[]{8, 8, 8};
        f14835n = new int[]{8};
        f14836o = new byte[]{-1, -40, -1};
        f14837p = new byte[]{102, 116, 121, 112};
        f14838q = new byte[]{109, 105, 102, 49};
        f14839r = new byte[]{104, 101, 105, 99};
        f14840s = new byte[]{79, 76, 89, 77, 80, 0};
        f14841t = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f14842u = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f14843v = new byte[]{101, 88, 73, 102};
        f14844w = new byte[]{73, 72, 68, 82};
        f14845x = new byte[]{73, 69, 78, 68};
        f14846y = new byte[]{82, 73, 70, 70};
        f14847z = new byte[]{87, 69, 66, 80};
        f14821A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f14822B = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f14823C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f14824D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C1865d[] c1865dArr = {new C1865d("NewSubfileType", 254, 4), new C1865d("SubfileType", 255, 4), new C1865d(256, 3, 4, "ImageWidth"), new C1865d(257, 3, 4, "ImageLength"), new C1865d("BitsPerSample", 258, 3), new C1865d("Compression", 259, 3), new C1865d("PhotometricInterpretation", 262, 3), new C1865d("ImageDescription", 270, 2), new C1865d("Make", 271, 2), new C1865d("Model", 272, 2), new C1865d(273, 3, 4, "StripOffsets"), new C1865d("Orientation", 274, 3), new C1865d("SamplesPerPixel", 277, 3), new C1865d(278, 3, 4, "RowsPerStrip"), new C1865d(279, 3, 4, "StripByteCounts"), new C1865d("XResolution", 282, 5), new C1865d("YResolution", 283, 5), new C1865d("PlanarConfiguration", 284, 3), new C1865d("ResolutionUnit", 296, 3), new C1865d("TransferFunction", 301, 3), new C1865d("Software", 305, 2), new C1865d("DateTime", 306, 2), new C1865d("Artist", 315, 2), new C1865d("WhitePoint", 318, 5), new C1865d("PrimaryChromaticities", 319, 5), new C1865d("SubIFDPointer", 330, 4), new C1865d("JPEGInterchangeFormat", 513, 4), new C1865d("JPEGInterchangeFormatLength", 514, 4), new C1865d("YCbCrCoefficients", 529, 5), new C1865d("YCbCrSubSampling", 530, 3), new C1865d("YCbCrPositioning", 531, 3), new C1865d("ReferenceBlackWhite", 532, 5), new C1865d("Copyright", 33432, 2), new C1865d("ExifIFDPointer", 34665, 4), new C1865d("GPSInfoIFDPointer", 34853, 4), new C1865d("SensorTopBorder", 4, 4), new C1865d("SensorLeftBorder", 5, 4), new C1865d("SensorBottomBorder", 6, 4), new C1865d("SensorRightBorder", 7, 4), new C1865d("ISO", 23, 3), new C1865d("JpgFromRaw", 46, 7), new C1865d("Xmp", 700, 1)};
        C1865d[] c1865dArr2 = {new C1865d("ExposureTime", 33434, 5), new C1865d("FNumber", 33437, 5), new C1865d("ExposureProgram", 34850, 3), new C1865d("SpectralSensitivity", 34852, 2), new C1865d("PhotographicSensitivity", 34855, 3), new C1865d("OECF", 34856, 7), new C1865d("SensitivityType", 34864, 3), new C1865d("StandardOutputSensitivity", 34865, 4), new C1865d("RecommendedExposureIndex", 34866, 4), new C1865d("ISOSpeed", 34867, 4), new C1865d("ISOSpeedLatitudeyyy", 34868, 4), new C1865d("ISOSpeedLatitudezzz", 34869, 4), new C1865d("ExifVersion", 36864, 2), new C1865d("DateTimeOriginal", 36867, 2), new C1865d("DateTimeDigitized", 36868, 2), new C1865d("OffsetTime", 36880, 2), new C1865d("OffsetTimeOriginal", 36881, 2), new C1865d("OffsetTimeDigitized", 36882, 2), new C1865d("ComponentsConfiguration", 37121, 7), new C1865d("CompressedBitsPerPixel", 37122, 5), new C1865d("ShutterSpeedValue", 37377, 10), new C1865d("ApertureValue", 37378, 5), new C1865d("BrightnessValue", 37379, 10), new C1865d("ExposureBiasValue", 37380, 10), new C1865d("MaxApertureValue", 37381, 5), new C1865d("SubjectDistance", 37382, 5), new C1865d("MeteringMode", 37383, 3), new C1865d("LightSource", 37384, 3), new C1865d("Flash", 37385, 3), new C1865d("FocalLength", 37386, 5), new C1865d("SubjectArea", 37396, 3), new C1865d("MakerNote", 37500, 7), new C1865d("UserComment", 37510, 7), new C1865d("SubSecTime", 37520, 2), new C1865d("SubSecTimeOriginal", 37521, 2), new C1865d("SubSecTimeDigitized", 37522, 2), new C1865d("FlashpixVersion", 40960, 7), new C1865d("ColorSpace", 40961, 3), new C1865d(40962, 3, 4, "PixelXDimension"), new C1865d(40963, 3, 4, "PixelYDimension"), new C1865d("RelatedSoundFile", 40964, 2), new C1865d("InteroperabilityIFDPointer", 40965, 4), new C1865d("FlashEnergy", 41483, 5), new C1865d("SpatialFrequencyResponse", 41484, 7), new C1865d("FocalPlaneXResolution", 41486, 5), new C1865d("FocalPlaneYResolution", 41487, 5), new C1865d("FocalPlaneResolutionUnit", 41488, 3), new C1865d("SubjectLocation", 41492, 3), new C1865d("ExposureIndex", 41493, 5), new C1865d("SensingMethod", 41495, 3), new C1865d("FileSource", 41728, 7), new C1865d("SceneType", 41729, 7), new C1865d("CFAPattern", 41730, 7), new C1865d("CustomRendered", 41985, 3), new C1865d("ExposureMode", 41986, 3), new C1865d("WhiteBalance", 41987, 3), new C1865d("DigitalZoomRatio", 41988, 5), new C1865d("FocalLengthIn35mmFilm", 41989, 3), new C1865d("SceneCaptureType", 41990, 3), new C1865d("GainControl", 41991, 3), new C1865d("Contrast", 41992, 3), new C1865d("Saturation", 41993, 3), new C1865d("Sharpness", 41994, 3), new C1865d("DeviceSettingDescription", 41995, 7), new C1865d("SubjectDistanceRange", 41996, 3), new C1865d("ImageUniqueID", 42016, 2), new C1865d("CameraOwnerName", 42032, 2), new C1865d("BodySerialNumber", 42033, 2), new C1865d("LensSpecification", 42034, 5), new C1865d("LensMake", 42035, 2), new C1865d("LensModel", 42036, 2), new C1865d("Gamma", 42240, 5), new C1865d("DNGVersion", 50706, 1), new C1865d(50720, 3, 4, "DefaultCropSize")};
        C1865d[] c1865dArr3 = {new C1865d("GPSVersionID", 0, 1), new C1865d("GPSLatitudeRef", 1, 2), new C1865d(2, 5, 10, "GPSLatitude"), new C1865d("GPSLongitudeRef", 3, 2), new C1865d(4, 5, 10, "GPSLongitude"), new C1865d("GPSAltitudeRef", 5, 1), new C1865d("GPSAltitude", 6, 5), new C1865d("GPSTimeStamp", 7, 5), new C1865d("GPSSatellites", 8, 2), new C1865d("GPSStatus", 9, 2), new C1865d("GPSMeasureMode", 10, 2), new C1865d("GPSDOP", 11, 5), new C1865d("GPSSpeedRef", 12, 2), new C1865d("GPSSpeed", 13, 5), new C1865d("GPSTrackRef", 14, 2), new C1865d("GPSTrack", 15, 5), new C1865d("GPSImgDirectionRef", 16, 2), new C1865d("GPSImgDirection", 17, 5), new C1865d("GPSMapDatum", 18, 2), new C1865d("GPSDestLatitudeRef", 19, 2), new C1865d("GPSDestLatitude", 20, 5), new C1865d("GPSDestLongitudeRef", 21, 2), new C1865d("GPSDestLongitude", 22, 5), new C1865d("GPSDestBearingRef", 23, 2), new C1865d("GPSDestBearing", 24, 5), new C1865d("GPSDestDistanceRef", 25, 2), new C1865d("GPSDestDistance", 26, 5), new C1865d("GPSProcessingMethod", 27, 7), new C1865d("GPSAreaInformation", 28, 7), new C1865d("GPSDateStamp", 29, 2), new C1865d("GPSDifferential", 30, 3), new C1865d("GPSHPositioningError", 31, 5)};
        C1865d[] c1865dArr4 = {new C1865d("InteroperabilityIndex", 1, 2)};
        C1865d[] c1865dArr5 = {new C1865d("NewSubfileType", 254, 4), new C1865d("SubfileType", 255, 4), new C1865d(256, 3, 4, "ThumbnailImageWidth"), new C1865d(257, 3, 4, "ThumbnailImageLength"), new C1865d("BitsPerSample", 258, 3), new C1865d("Compression", 259, 3), new C1865d("PhotometricInterpretation", 262, 3), new C1865d("ImageDescription", 270, 2), new C1865d("Make", 271, 2), new C1865d("Model", 272, 2), new C1865d(273, 3, 4, "StripOffsets"), new C1865d("ThumbnailOrientation", 274, 3), new C1865d("SamplesPerPixel", 277, 3), new C1865d(278, 3, 4, "RowsPerStrip"), new C1865d(279, 3, 4, "StripByteCounts"), new C1865d("XResolution", 282, 5), new C1865d("YResolution", 283, 5), new C1865d("PlanarConfiguration", 284, 3), new C1865d("ResolutionUnit", 296, 3), new C1865d("TransferFunction", 301, 3), new C1865d("Software", 305, 2), new C1865d("DateTime", 306, 2), new C1865d("Artist", 315, 2), new C1865d("WhitePoint", 318, 5), new C1865d("PrimaryChromaticities", 319, 5), new C1865d("SubIFDPointer", 330, 4), new C1865d("JPEGInterchangeFormat", 513, 4), new C1865d("JPEGInterchangeFormatLength", 514, 4), new C1865d("YCbCrCoefficients", 529, 5), new C1865d("YCbCrSubSampling", 530, 3), new C1865d("YCbCrPositioning", 531, 3), new C1865d("ReferenceBlackWhite", 532, 5), new C1865d("Copyright", 33432, 2), new C1865d("ExifIFDPointer", 34665, 4), new C1865d("GPSInfoIFDPointer", 34853, 4), new C1865d("DNGVersion", 50706, 1), new C1865d(50720, 3, 4, "DefaultCropSize")};
        f14825E = new C1865d("StripOffsets", 273, 3);
        f14826F = new C1865d[][]{c1865dArr, c1865dArr2, c1865dArr3, c1865dArr4, c1865dArr5, c1865dArr, new C1865d[]{new C1865d("ThumbnailImage", 256, 7), new C1865d("CameraSettingsIFDPointer", 8224, 4), new C1865d("ImageProcessingIFDPointer", 8256, 4)}, new C1865d[]{new C1865d("PreviewImageStart", 257, 4), new C1865d("PreviewImageLength", 258, 4)}, new C1865d[]{new C1865d("AspectFrame", 4371, 3)}, new C1865d[]{new C1865d("ColorSpace", 55, 3)}};
        f14827G = new C1865d[]{new C1865d("SubIFDPointer", 330, 4), new C1865d("ExifIFDPointer", 34665, 4), new C1865d("GPSInfoIFDPointer", 34853, 4), new C1865d("InteroperabilityIFDPointer", 40965, 4), new C1865d("CameraSettingsIFDPointer", 8224, 1), new C1865d("ImageProcessingIFDPointer", 8256, 1)};
        f14828H = new HashMap[10];
        I = new HashMap[10];
        J = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f14829K = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f14830L = charsetForName;
        f14831M = "Exif\u0000\u0000".getBytes(charsetForName);
        f14832N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i7 = 0;
        while (true) {
            C1865d[][] c1865dArr6 = f14826F;
            if (i7 >= c1865dArr6.length) {
                HashMap map = f14829K;
                C1865d[] c1865dArr7 = f14827G;
                map.put(Integer.valueOf(c1865dArr7[0].a), 5);
                map.put(Integer.valueOf(c1865dArr7[1].a), 1);
                map.put(Integer.valueOf(c1865dArr7[2].a), 2);
                map.put(Integer.valueOf(c1865dArr7[3].a), 3);
                map.put(Integer.valueOf(c1865dArr7[4].a), 7);
                map.put(Integer.valueOf(c1865dArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f14828H[i7] = new HashMap();
            I[i7] = new HashMap();
            for (C1865d c1865d : c1865dArr6[i7]) {
                f14828H[i7].put(Integer.valueOf(c1865d.a), c1865d);
                I[i7].put(c1865d.f14817b, c1865d);
            }
            i7++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00d8 A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005e, blocks: (B:14:0x004f, B:16:0x0052, B:23:0x0067, B:29:0x0084, B:31:0x008f, B:39:0x00a5, B:34:0x0096, B:37:0x009e, B:38:0x00a2, B:40:0x00af, B:42:0x00b8, B:44:0x00be, B:46:0x00c4, B:48:0x00ca, B:53:0x00d8), top: B:65:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1868g(java.io.InputStream r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.C1868g.<init>(java.io.InputStream):void");
    }

    public static ByteOrder q(C1863b c1863b) throws IOException {
        short s7 = c1863b.readShort();
        boolean z7 = f14833l;
        if (s7 == 18761) {
            if (z7) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s7 == 19789) {
            if (z7) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s7));
    }

    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap[] mapArr = this.f14850d;
        if (strB != null && b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strB.concat("\u0000").getBytes(f14830L);
            map.put("DateTime", new C1864c(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", C1864c.a(0L, this.f14852f));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", C1864c.a(0L, this.f14852f));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", C1864c.a(0L, this.f14852f));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", C1864c.a(0L, this.f14852f));
        }
    }

    public final String b(String str) {
        C1864c c1864cC = c(str);
        if (c1864cC != null) {
            if (!J.contains(str)) {
                return c1864cC.f(this.f14852f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i7 = c1864cC.a;
                if (i7 != 5 && i7 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i7);
                    return null;
                }
                C1866e[] c1866eArr = (C1866e[]) c1864cC.g(this.f14852f);
                if (c1866eArr == null || c1866eArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c1866eArr));
                    return null;
                }
                C1866e c1866e = c1866eArr[0];
                Integer numValueOf = Integer.valueOf((int) (c1866e.a / c1866e.f14820b));
                C1866e c1866e2 = c1866eArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (c1866e2.a / c1866e2.f14820b));
                C1866e c1866e3 = c1866eArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c1866e3.a / c1866e3.f14820b)));
            }
            try {
                return Double.toString(c1864cC.d(this.f14852f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final C1864c c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f14833l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i7 = 0; i7 < f14826F.length; i7++) {
            C1864c c1864c = (C1864c) this.f14850d[i7].get(str);
            if (c1864c != null) {
                return c1864c;
            }
        }
        return null;
    }

    public final void d(C1867f c1867f) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                AbstractC1870i.a(mediaMetadataRetriever, new C1862a(c1867f));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f14850d;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", C1864c.c(Integer.parseInt(strExtractMetadata), this.f14852f));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", C1864c.c(Integer.parseInt(strExtractMetadata2), this.f14852f));
                }
                if (strExtractMetadata3 != null) {
                    int i7 = Integer.parseInt(strExtractMetadata3);
                    mapArr[0].put("Orientation", C1864c.c(i7 != 90 ? i7 != 180 ? i7 != 270 ? 1 : 8 : 3 : 6, this.f14852f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i8 = Integer.parseInt(strExtractMetadata4);
                    int i9 = Integer.parseInt(strExtractMetadata5);
                    if (i9 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c1867f.e(i8);
                    byte[] bArr = new byte[6];
                    c1867f.readFully(bArr);
                    int i10 = i8 + 6;
                    int i11 = i9 - 6;
                    if (!Arrays.equals(bArr, f14831M)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i11];
                    c1867f.readFully(bArr2);
                    this.f14854h = i10;
                    r(bArr2, 0);
                }
                if (f14833l) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0197, code lost:
    
        r23.f14811m = r22.f14852f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x019b, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(r1.C1863b r23, int r24, int r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.C1868g.e(r1.b, int, int):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:169|12|(4:164|13|150|14)|(16:17|(2:19|20)(1:28)|23|29|(1:31)|32|(4:152|35|(7:154|39|40|(3:43|(1:45)(2:46|(1:48))|(1:179)(3:177|51|52))(1:180)|53|36|37)|176)|34|160|65|162|66|67|(1:73)(1:72)|74|(1:87)(8:156|89|158|90|91|(1:93)(1:94)|95|(1:107)(3:109|(2:110|(2:112|(2:170|114)(1:115))(2:171|116))|(1:118)(4:120|(2:121|(2:123|(1:173)(1:126))(3:172|127|(2:128|(2:130|(1:175)(1:133))(2:174|134))))|125|(1:136)(1:138)))))|16|160|65|162|66|67|(3:69|73|74)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r9 < 16) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ef, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f0, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f4, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f6, code lost:
    
        if (r6 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f8, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fb, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00fc, code lost:
    
        if (r2 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00fe, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0101, code lost:
    
        r0 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0139 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0105 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(java.io.BufferedInputStream r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.C1868g.f(java.io.BufferedInputStream):int");
    }

    public final void g(C1867f c1867f) throws IOException {
        int i7;
        int i8;
        j(c1867f);
        HashMap[] mapArr = this.f14850d;
        C1864c c1864c = (C1864c) mapArr[1].get("MakerNote");
        if (c1864c != null) {
            C1867f c1867f2 = new C1867f(c1864c.f14816d);
            c1867f2.f14811m = this.f14852f;
            byte[] bArr = f14840s;
            byte[] bArr2 = new byte[bArr.length];
            c1867f2.readFully(bArr2);
            c1867f2.e(0L);
            byte[] bArr3 = f14841t;
            byte[] bArr4 = new byte[bArr3.length];
            c1867f2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c1867f2.e(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c1867f2.e(12L);
            }
            s(c1867f2, 6);
            C1864c c1864c2 = (C1864c) mapArr[7].get("PreviewImageStart");
            C1864c c1864c3 = (C1864c) mapArr[7].get("PreviewImageLength");
            if (c1864c2 != null && c1864c3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", c1864c2);
                mapArr[5].put("JPEGInterchangeFormatLength", c1864c3);
            }
            C1864c c1864c4 = (C1864c) mapArr[8].get("AspectFrame");
            if (c1864c4 != null) {
                int[] iArr = (int[]) c1864c4.g(this.f14852f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i9 = iArr[2];
                int i10 = iArr[0];
                if (i9 <= i10 || (i7 = iArr[3]) <= (i8 = iArr[1])) {
                    return;
                }
                int i11 = (i9 - i10) + 1;
                int i12 = (i7 - i8) + 1;
                if (i11 < i12) {
                    int i13 = i11 + i12;
                    i12 = i13 - i12;
                    i11 = i13 - i12;
                }
                C1864c c1864cC = C1864c.c(i11, this.f14852f);
                C1864c c1864cC2 = C1864c.c(i12, this.f14852f);
                mapArr[0].put("ImageWidth", c1864cC);
                mapArr[0].put("ImageLength", c1864cC2);
            }
        }
    }

    public final void h(C1863b c1863b) throws IOException {
        if (f14833l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c1863b);
        }
        c1863b.f14811m = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f14842u;
        c1863b.b(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i7 = c1863b.readInt();
                byte[] bArr2 = new byte[4];
                c1863b.readFully(bArr2);
                int i8 = length + 8;
                if (i8 == 16 && !Arrays.equals(bArr2, f14844w)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f14845x)) {
                    return;
                }
                if (Arrays.equals(bArr2, f14843v)) {
                    byte[] bArr3 = new byte[i7];
                    c1863b.readFully(bArr3);
                    int i9 = c1863b.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i9) {
                        this.f14854h = i8;
                        r(bArr3, 0);
                        x();
                        u(new C1863b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i9 + ", calculated CRC value: " + crc32.getValue());
                }
                int i10 = i7 + 4;
                c1863b.b(i10);
                length = i8 + i10;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(C1863b c1863b) throws IOException {
        boolean z7 = f14833l;
        if (z7) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c1863b);
        }
        c1863b.b(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c1863b.readFully(bArr);
        c1863b.readFully(bArr2);
        c1863b.readFully(bArr3);
        int i7 = ByteBuffer.wrap(bArr).getInt();
        int i8 = ByteBuffer.wrap(bArr2).getInt();
        int i9 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i8];
        c1863b.b(i7 - c1863b.f14810l);
        c1863b.readFully(bArr4);
        e(new C1863b(bArr4), i7, 5);
        c1863b.b(i9 - c1863b.f14810l);
        c1863b.f14811m = ByteOrder.BIG_ENDIAN;
        int i10 = c1863b.readInt();
        if (z7) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i10);
        }
        for (int i11 = 0; i11 < i10; i11++) {
            int unsignedShort = c1863b.readUnsignedShort();
            int unsignedShort2 = c1863b.readUnsignedShort();
            if (unsignedShort == f14825E.a) {
                short s7 = c1863b.readShort();
                short s8 = c1863b.readShort();
                C1864c c1864cC = C1864c.c(s7, this.f14852f);
                C1864c c1864cC2 = C1864c.c(s8, this.f14852f);
                HashMap[] mapArr = this.f14850d;
                mapArr[0].put("ImageLength", c1864cC);
                mapArr[0].put("ImageWidth", c1864cC2);
                if (z7) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s7) + ", width: " + ((int) s8));
                    return;
                }
                return;
            }
            c1863b.b(unsignedShort2);
        }
    }

    public final void j(C1867f c1867f) throws IOException {
        o(c1867f);
        s(c1867f, 0);
        w(c1867f, 0);
        w(c1867f, 5);
        w(c1867f, 4);
        x();
        if (this.f14849c == 8) {
            HashMap[] mapArr = this.f14850d;
            C1864c c1864c = (C1864c) mapArr[1].get("MakerNote");
            if (c1864c != null) {
                C1867f c1867f2 = new C1867f(c1864c.f14816d);
                c1867f2.f14811m = this.f14852f;
                c1867f2.b(6);
                s(c1867f2, 9);
                C1864c c1864c2 = (C1864c) mapArr[9].get("ColorSpace");
                if (c1864c2 != null) {
                    mapArr[1].put("ColorSpace", c1864c2);
                }
            }
        }
    }

    public final void k(C1867f c1867f) throws IOException {
        if (f14833l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c1867f);
        }
        j(c1867f);
        HashMap[] mapArr = this.f14850d;
        C1864c c1864c = (C1864c) mapArr[0].get("JpgFromRaw");
        if (c1864c != null) {
            e(new C1863b(c1864c.f14816d), (int) c1864c.f14815c, 5);
        }
        C1864c c1864c2 = (C1864c) mapArr[0].get("ISO");
        C1864c c1864c3 = (C1864c) mapArr[1].get("PhotographicSensitivity");
        if (c1864c2 == null || c1864c3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", c1864c2);
    }

    public final void l(C1863b c1863b) throws IOException {
        if (f14833l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c1863b);
        }
        c1863b.f14811m = ByteOrder.LITTLE_ENDIAN;
        c1863b.b(f14846y.length);
        int i7 = c1863b.readInt() + 8;
        byte[] bArr = f14847z;
        c1863b.b(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                c1863b.readFully(bArr2);
                int i8 = c1863b.readInt();
                int i9 = length + 8;
                if (Arrays.equals(f14821A, bArr2)) {
                    byte[] bArr3 = new byte[i8];
                    c1863b.readFully(bArr3);
                    this.f14854h = i9;
                    r(bArr3, 0);
                    u(new C1863b(bArr3));
                    return;
                }
                if (i8 % 2 == 1) {
                    i8++;
                }
                length = i9 + i8;
                if (length == i7) {
                    return;
                }
                if (length > i7) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                c1863b.b(i8);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(C1863b c1863b, HashMap map) throws IOException {
        C1864c c1864c = (C1864c) map.get("JPEGInterchangeFormat");
        C1864c c1864c2 = (C1864c) map.get("JPEGInterchangeFormatLength");
        if (c1864c == null || c1864c2 == null) {
            return;
        }
        int iE = c1864c.e(this.f14852f);
        int iE2 = c1864c2.e(this.f14852f);
        if (this.f14849c == 7) {
            iE += this.f14855i;
        }
        if (iE > 0 && iE2 > 0 && this.f14848b == null && this.a == null) {
            c1863b.b(iE);
            c1863b.readFully(new byte[iE2]);
        }
        if (f14833l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iE + ", length: " + iE2);
        }
    }

    public final boolean n(HashMap map) {
        C1864c c1864c = (C1864c) map.get("ImageLength");
        C1864c c1864c2 = (C1864c) map.get("ImageWidth");
        if (c1864c == null || c1864c2 == null) {
            return false;
        }
        return c1864c.e(this.f14852f) <= 512 && c1864c2.e(this.f14852f) <= 512;
    }

    public final void o(C1867f c1867f) throws IOException {
        ByteOrder byteOrderQ = q(c1867f);
        this.f14852f = byteOrderQ;
        c1867f.f14811m = byteOrderQ;
        int unsignedShort = c1867f.readUnsignedShort();
        int i7 = this.f14849c;
        if (i7 != 7 && i7 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i8 = c1867f.readInt();
        if (i8 < 8) {
            throw new IOException(AbstractC0703b.g(i8, "Invalid first Ifd offset: "));
        }
        int i9 = i8 - 8;
        if (i9 > 0) {
            c1867f.b(i9);
        }
    }

    public final void p() {
        int i7 = 0;
        while (true) {
            HashMap[] mapArr = this.f14850d;
            if (i7 >= mapArr.length) {
                return;
            }
            StringBuilder sbP = AbstractC0703b.p(i7, "The size of tag group[", "]: ");
            sbP.append(mapArr[i7].size());
            Log.d("ExifInterface", sbP.toString());
            for (Map.Entry entry : mapArr[i7].entrySet()) {
                C1864c c1864c = (C1864c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c1864c.toString() + ", tagValue: '" + c1864c.f(this.f14852f) + "'");
            }
            i7++;
        }
    }

    public final void r(byte[] bArr, int i7) throws IOException {
        C1867f c1867f = new C1867f(bArr);
        o(c1867f);
        s(c1867f, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(r1.C1867f r27, int r28) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 927
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.C1868g.s(r1.f, int):void");
    }

    public final void t(int i7, String str, String str2) {
        HashMap[] mapArr = this.f14850d;
        if (mapArr[i7].isEmpty() || mapArr[i7].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i7];
        map.put(str2, map.get(str));
        mapArr[i7].remove(str);
    }

    public final void u(C1863b c1863b) throws IOException {
        C1864c c1864c;
        int iE;
        HashMap map = this.f14850d[4];
        C1864c c1864c2 = (C1864c) map.get("Compression");
        if (c1864c2 == null) {
            m(c1863b, map);
            return;
        }
        int iE2 = c1864c2.e(this.f14852f);
        if (iE2 != 1) {
            if (iE2 == 6) {
                m(c1863b, map);
                return;
            } else if (iE2 != 7) {
                return;
            }
        }
        C1864c c1864c3 = (C1864c) map.get("BitsPerSample");
        if (c1864c3 != null) {
            int[] iArr = (int[]) c1864c3.g(this.f14852f);
            int[] iArr2 = f14834m;
            if (Arrays.equals(iArr2, iArr) || (this.f14849c == 3 && (c1864c = (C1864c) map.get("PhotometricInterpretation")) != null && (((iE = c1864c.e(this.f14852f)) == 1 && Arrays.equals(iArr, f14835n)) || (iE == 6 && Arrays.equals(iArr, iArr2))))) {
                C1864c c1864c4 = (C1864c) map.get("StripOffsets");
                C1864c c1864c5 = (C1864c) map.get("StripByteCounts");
                if (c1864c4 == null || c1864c5 == null) {
                    return;
                }
                long[] jArrM = AbstractC0870c.M(c1864c4.g(this.f14852f));
                long[] jArrM2 = AbstractC0870c.M(c1864c5.g(this.f14852f));
                if (jArrM == null || jArrM.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrM2 == null || jArrM2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrM.length != jArrM2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j7 = 0;
                for (long j8 : jArrM2) {
                    j7 += j8;
                }
                byte[] bArr = new byte[(int) j7];
                this.f14853g = true;
                int i7 = 0;
                int i8 = 0;
                for (int i9 = 0; i9 < jArrM.length; i9++) {
                    int i10 = (int) jArrM[i9];
                    int i11 = (int) jArrM2[i9];
                    if (i9 < jArrM.length - 1 && i10 + i11 != jArrM[i9 + 1]) {
                        this.f14853g = false;
                    }
                    int i12 = i10 - i7;
                    if (i12 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        c1863b.b(i12);
                        int i13 = i7 + i12;
                        byte[] bArr2 = new byte[i11];
                        try {
                            c1863b.readFully(bArr2);
                            i7 = i13 + i11;
                            System.arraycopy(bArr2, 0, bArr, i8, i11);
                            i8 += i11;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i11 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i12 + " bytes.");
                        return;
                    }
                }
                if (this.f14853g) {
                    long j9 = jArrM[0];
                    return;
                }
                return;
            }
        }
        if (f14833l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void v(int i7, int i8) {
        HashMap[] mapArr = this.f14850d;
        boolean zIsEmpty = mapArr[i7].isEmpty();
        boolean z7 = f14833l;
        if (zIsEmpty || mapArr[i8].isEmpty()) {
            if (z7) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        C1864c c1864c = (C1864c) mapArr[i7].get("ImageLength");
        C1864c c1864c2 = (C1864c) mapArr[i7].get("ImageWidth");
        C1864c c1864c3 = (C1864c) mapArr[i8].get("ImageLength");
        C1864c c1864c4 = (C1864c) mapArr[i8].get("ImageWidth");
        if (c1864c == null || c1864c2 == null) {
            if (z7) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (c1864c3 == null || c1864c4 == null) {
            if (z7) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iE = c1864c.e(this.f14852f);
        int iE2 = c1864c2.e(this.f14852f);
        int iE3 = c1864c3.e(this.f14852f);
        int iE4 = c1864c4.e(this.f14852f);
        if (iE >= iE3 || iE2 >= iE4) {
            return;
        }
        HashMap map = mapArr[i7];
        mapArr[i7] = mapArr[i8];
        mapArr[i8] = map;
    }

    public final void w(C1867f c1867f, int i7) throws IOException {
        C1864c c1864cC;
        C1864c c1864cC2;
        HashMap[] mapArr = this.f14850d;
        C1864c c1864c = (C1864c) mapArr[i7].get("DefaultCropSize");
        C1864c c1864c2 = (C1864c) mapArr[i7].get("SensorTopBorder");
        C1864c c1864c3 = (C1864c) mapArr[i7].get("SensorLeftBorder");
        C1864c c1864c4 = (C1864c) mapArr[i7].get("SensorBottomBorder");
        C1864c c1864c5 = (C1864c) mapArr[i7].get("SensorRightBorder");
        if (c1864c != null) {
            if (c1864c.a == 5) {
                C1866e[] c1866eArr = (C1866e[]) c1864c.g(this.f14852f);
                if (c1866eArr == null || c1866eArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c1866eArr));
                    return;
                }
                c1864cC = C1864c.b(c1866eArr[0], this.f14852f);
                c1864cC2 = C1864c.b(c1866eArr[1], this.f14852f);
            } else {
                int[] iArr = (int[]) c1864c.g(this.f14852f);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c1864cC = C1864c.c(iArr[0], this.f14852f);
                c1864cC2 = C1864c.c(iArr[1], this.f14852f);
            }
            mapArr[i7].put("ImageWidth", c1864cC);
            mapArr[i7].put("ImageLength", c1864cC2);
            return;
        }
        if (c1864c2 != null && c1864c3 != null && c1864c4 != null && c1864c5 != null) {
            int iE = c1864c2.e(this.f14852f);
            int iE2 = c1864c4.e(this.f14852f);
            int iE3 = c1864c5.e(this.f14852f);
            int iE4 = c1864c3.e(this.f14852f);
            if (iE2 <= iE || iE3 <= iE4) {
                return;
            }
            C1864c c1864cC3 = C1864c.c(iE2 - iE, this.f14852f);
            C1864c c1864cC4 = C1864c.c(iE3 - iE4, this.f14852f);
            mapArr[i7].put("ImageLength", c1864cC3);
            mapArr[i7].put("ImageWidth", c1864cC4);
            return;
        }
        C1864c c1864c6 = (C1864c) mapArr[i7].get("ImageLength");
        C1864c c1864c7 = (C1864c) mapArr[i7].get("ImageWidth");
        if (c1864c6 == null || c1864c7 == null) {
            C1864c c1864c8 = (C1864c) mapArr[i7].get("JPEGInterchangeFormat");
            C1864c c1864c9 = (C1864c) mapArr[i7].get("JPEGInterchangeFormatLength");
            if (c1864c8 == null || c1864c9 == null) {
                return;
            }
            int iE5 = c1864c8.e(this.f14852f);
            int iE6 = c1864c8.e(this.f14852f);
            c1867f.e(iE5);
            byte[] bArr = new byte[iE6];
            c1867f.readFully(bArr);
            e(new C1863b(bArr), iE5, i7);
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] mapArr = this.f14850d;
        C1864c c1864c = (C1864c) mapArr[1].get("PixelXDimension");
        C1864c c1864c2 = (C1864c) mapArr[1].get("PixelYDimension");
        if (c1864c != null && c1864c2 != null) {
            mapArr[0].put("ImageWidth", c1864c);
            mapArr[0].put("ImageLength", c1864c2);
        }
        if (mapArr[4].isEmpty() && n(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!n(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t(0, "ThumbnailOrientation", "Orientation");
        t(0, "ThumbnailImageLength", "ImageLength");
        t(0, "ThumbnailImageWidth", "ImageWidth");
        t(5, "ThumbnailOrientation", "Orientation");
        t(5, "ThumbnailImageLength", "ImageLength");
        t(5, "ThumbnailImageWidth", "ImageWidth");
        t(4, "Orientation", "ThumbnailOrientation");
        t(4, "ImageLength", "ThumbnailImageLength");
        t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
