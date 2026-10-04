package c3;

import android.graphics.Bitmap;
import f6.C0890D;
import f6.C0920r;
import g3.AbstractC0946e;
import i4.C1076b;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public final class c {
    public final C0890D a;

    /* renamed from: b, reason: collision with root package name */
    public final C0753b f11151b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f11152c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11153d;

    /* renamed from: e, reason: collision with root package name */
    public final Date f11154e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11155f;

    /* renamed from: g, reason: collision with root package name */
    public final Date f11156g;

    /* renamed from: h, reason: collision with root package name */
    public final long f11157h;

    /* renamed from: i, reason: collision with root package name */
    public final long f11158i;

    /* renamed from: j, reason: collision with root package name */
    public final String f11159j;

    /* renamed from: k, reason: collision with root package name */
    public final int f11160k;

    public c(C0890D c0890d, C0753b c0753b) {
        int i7;
        this.a = c0890d;
        this.f11151b = c0753b;
        this.f11160k = -1;
        if (c0753b != null) {
            this.f11157h = c0753b.f11147c;
            this.f11158i = c0753b.f11148d;
            C0920r c0920r = c0753b.f11150f;
            int size = c0920r.size();
            for (int i8 = 0; i8 < size; i8++) {
                String strH = c0920r.h(i8);
                Date date = null;
                if (AbstractC2517v.M(strH, "Date", true)) {
                    String strA = c0920r.a("Date");
                    if (strA != null) {
                        C1076b c1076b = k6.c.a;
                        if (strA.length() != 0) {
                            ParsePosition parsePosition = new ParsePosition(0);
                            Date date2 = ((DateFormat) k6.c.a.get()).parse(strA, parsePosition);
                            if (parsePosition.getIndex() == strA.length()) {
                                date = date2;
                            } else {
                                String[] strArr = k6.c.f12696b;
                                synchronized (strArr) {
                                    try {
                                        int length = strArr.length;
                                        int i9 = 0;
                                        while (true) {
                                            if (i9 >= length) {
                                                break;
                                            }
                                            DateFormat[] dateFormatArr = k6.c.f12697c;
                                            DateFormat simpleDateFormat = dateFormatArr[i9];
                                            if (simpleDateFormat == null) {
                                                simpleDateFormat = new SimpleDateFormat(k6.c.f12696b[i9], Locale.US);
                                                simpleDateFormat.setTimeZone(g6.b.f11774d);
                                                dateFormatArr[i9] = simpleDateFormat;
                                            }
                                            parsePosition.setIndex(0);
                                            Date date3 = simpleDateFormat.parse(strA, parsePosition);
                                            if (parsePosition.getIndex() != 0) {
                                                date = date3;
                                                break;
                                            }
                                            i9++;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        }
                    }
                    this.f11152c = date;
                    this.f11153d = c0920r.m(i8);
                } else if (AbstractC2517v.M(strH, "Expires", true)) {
                    String strA2 = c0920r.a("Expires");
                    if (strA2 != null) {
                        C1076b c1076b2 = k6.c.a;
                        if (strA2.length() != 0) {
                            ParsePosition parsePosition2 = new ParsePosition(0);
                            Date date4 = ((DateFormat) k6.c.a.get()).parse(strA2, parsePosition2);
                            if (parsePosition2.getIndex() == strA2.length()) {
                                date = date4;
                            } else {
                                String[] strArr2 = k6.c.f12696b;
                                synchronized (strArr2) {
                                    try {
                                        int length2 = strArr2.length;
                                        int i10 = 0;
                                        while (true) {
                                            if (i10 >= length2) {
                                                break;
                                            }
                                            DateFormat[] dateFormatArr2 = k6.c.f12697c;
                                            DateFormat simpleDateFormat2 = dateFormatArr2[i10];
                                            if (simpleDateFormat2 == null) {
                                                simpleDateFormat2 = new SimpleDateFormat(k6.c.f12696b[i10], Locale.US);
                                                simpleDateFormat2.setTimeZone(g6.b.f11774d);
                                                dateFormatArr2[i10] = simpleDateFormat2;
                                            }
                                            parsePosition2.setIndex(0);
                                            Date date5 = simpleDateFormat2.parse(strA2, parsePosition2);
                                            if (parsePosition2.getIndex() != 0) {
                                                date = date5;
                                                break;
                                            }
                                            i10++;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            }
                        }
                    }
                    this.f11156g = date;
                } else if (AbstractC2517v.M(strH, "Last-Modified", true)) {
                    String strA3 = c0920r.a("Last-Modified");
                    if (strA3 != null) {
                        C1076b c1076b3 = k6.c.a;
                        if (strA3.length() != 0) {
                            ParsePosition parsePosition3 = new ParsePosition(0);
                            Date date6 = ((DateFormat) k6.c.a.get()).parse(strA3, parsePosition3);
                            if (parsePosition3.getIndex() == strA3.length()) {
                                date = date6;
                            } else {
                                String[] strArr3 = k6.c.f12696b;
                                synchronized (strArr3) {
                                    try {
                                        int length3 = strArr3.length;
                                        int i11 = 0;
                                        while (true) {
                                            if (i11 >= length3) {
                                                break;
                                            }
                                            DateFormat[] dateFormatArr3 = k6.c.f12697c;
                                            DateFormat simpleDateFormat3 = dateFormatArr3[i11];
                                            if (simpleDateFormat3 == null) {
                                                simpleDateFormat3 = new SimpleDateFormat(k6.c.f12696b[i11], Locale.US);
                                                simpleDateFormat3.setTimeZone(g6.b.f11774d);
                                                dateFormatArr3[i11] = simpleDateFormat3;
                                            }
                                            parsePosition3.setIndex(0);
                                            Date date7 = simpleDateFormat3.parse(strA3, parsePosition3);
                                            if (parsePosition3.getIndex() != 0) {
                                                date = date7;
                                                break;
                                            }
                                            i11++;
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                            }
                        }
                    }
                    this.f11154e = date;
                    this.f11155f = c0920r.m(i8);
                } else if (AbstractC2517v.M(strH, "ETag", true)) {
                    this.f11159j = c0920r.m(i8);
                } else if (AbstractC2517v.M(strH, "Age", true)) {
                    String strM = c0920r.m(i8);
                    Bitmap.Config config = AbstractC0946e.a;
                    Long lV = AbstractC2517v.V(strM);
                    if (lV != null) {
                        long jLongValue = lV.longValue();
                        i7 = jLongValue > 2147483647L ? Integer.MAX_VALUE : jLongValue < 0 ? 0 : (int) jLongValue;
                    } else {
                        i7 = -1;
                    }
                    this.f11160k = i7;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    /* JADX WARN: Type inference failed for: r5v1, types: [O3.i, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final c3.d a() {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.c.a():c3.d");
    }
}
