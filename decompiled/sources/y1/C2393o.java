package y1;

import B1.AbstractC0015b;
import android.text.TextUtils;
import j3.AbstractC1331q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.UUID;
import v.c0;

/* renamed from: y1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2393o {

    /* renamed from: A, reason: collision with root package name */
    public final int f18088A;

    /* renamed from: B, reason: collision with root package name */
    public final C2384f f18089B;

    /* renamed from: C, reason: collision with root package name */
    public final int f18090C;

    /* renamed from: D, reason: collision with root package name */
    public final int f18091D;

    /* renamed from: E, reason: collision with root package name */
    public final int f18092E;

    /* renamed from: F, reason: collision with root package name */
    public final int f18093F;

    /* renamed from: G, reason: collision with root package name */
    public final int f18094G;

    /* renamed from: H, reason: collision with root package name */
    public final int f18095H;
    public final int I;
    public final int J;

    /* renamed from: K, reason: collision with root package name */
    public final int f18096K;

    /* renamed from: L, reason: collision with root package name */
    public final int f18097L;

    /* renamed from: M, reason: collision with root package name */
    public final int f18098M;

    /* renamed from: N, reason: collision with root package name */
    public int f18099N;
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18100b;

    /* renamed from: c, reason: collision with root package name */
    public final j3.G f18101c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18102d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18103e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18104f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18105g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18106h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18107i;

    /* renamed from: j, reason: collision with root package name */
    public final int f18108j;

    /* renamed from: k, reason: collision with root package name */
    public final String f18109k;

    /* renamed from: l, reason: collision with root package name */
    public final C f18110l;

    /* renamed from: m, reason: collision with root package name */
    public final String f18111m;

    /* renamed from: n, reason: collision with root package name */
    public final String f18112n;

    /* renamed from: o, reason: collision with root package name */
    public final int f18113o;

    /* renamed from: p, reason: collision with root package name */
    public final int f18114p;

    /* renamed from: q, reason: collision with root package name */
    public final List f18115q;

    /* renamed from: r, reason: collision with root package name */
    public final C2389k f18116r;

    /* renamed from: s, reason: collision with root package name */
    public final long f18117s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f18118t;

    /* renamed from: u, reason: collision with root package name */
    public final int f18119u;

    /* renamed from: v, reason: collision with root package name */
    public final int f18120v;

    /* renamed from: w, reason: collision with root package name */
    public final float f18121w;

    /* renamed from: x, reason: collision with root package name */
    public final int f18122x;

    /* renamed from: y, reason: collision with root package name */
    public final float f18123y;

    /* renamed from: z, reason: collision with root package name */
    public final byte[] f18124z;

    static {
        new C2392n().a();
        B1.K.B(0);
        B1.K.B(1);
        B1.K.B(2);
        B1.K.B(3);
        B1.K.B(4);
        c0.d(5, 6, 7, 8, 9);
        c0.d(10, 11, 12, 13, 14);
        c0.d(15, 16, 17, 18, 19);
        c0.d(20, 21, 22, 23, 24);
        c0.d(25, 26, 27, 28, 29);
        c0.d(30, 31, 32, 33, 34);
    }

    public C2393o(C2392n c2392n) throws MissingResourceException {
        boolean z7;
        String str;
        this.a = c2392n.a;
        String strG = B1.K.G(c2392n.f18065d);
        this.f18102d = strG;
        if (c2392n.f18064c.isEmpty() && c2392n.f18063b != null) {
            this.f18101c = j3.G.w(new C2394p(strG, c2392n.f18063b));
            this.f18100b = c2392n.f18063b;
        } else if (!c2392n.f18064c.isEmpty() && c2392n.f18063b == null) {
            j3.G g4 = c2392n.f18064c;
            this.f18101c = g4;
            Iterator it = g4.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((C2394p) g4.get(0)).f18125b;
                    break;
                }
                C2394p c2394p = (C2394p) it.next();
                if (TextUtils.equals(c2394p.a, strG)) {
                    str = c2394p.f18125b;
                    break;
                }
            }
            this.f18100b = str;
        } else if (c2392n.f18064c.isEmpty() && c2392n.f18063b == null) {
            z7 = true;
            AbstractC0015b.h(z7);
            this.f18101c = c2392n.f18064c;
            this.f18100b = c2392n.f18063b;
        } else {
            for (int i7 = 0; i7 < c2392n.f18064c.size(); i7++) {
                if (((C2394p) c2392n.f18064c.get(i7)).f18125b.equals(c2392n.f18063b)) {
                    z7 = true;
                    break;
                }
            }
            z7 = false;
            AbstractC0015b.h(z7);
            this.f18101c = c2392n.f18064c;
            this.f18100b = c2392n.f18063b;
        }
        this.f18103e = c2392n.f18066e;
        AbstractC0015b.g("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", c2392n.f18068g == 0 || (c2392n.f18067f & 32768) != 0);
        this.f18104f = c2392n.f18067f;
        this.f18105g = c2392n.f18068g;
        int i8 = c2392n.f18069h;
        this.f18106h = i8;
        int i9 = c2392n.f18070i;
        this.f18107i = i9;
        this.f18108j = i9 != -1 ? i9 : i8;
        this.f18109k = c2392n.f18071j;
        this.f18110l = c2392n.f18072k;
        this.f18111m = c2392n.f18073l;
        this.f18112n = c2392n.f18074m;
        this.f18113o = c2392n.f18075n;
        this.f18114p = c2392n.f18076o;
        List list = c2392n.f18077p;
        this.f18115q = list == null ? Collections.EMPTY_LIST : list;
        C2389k c2389k = c2392n.f18078q;
        this.f18116r = c2389k;
        this.f18117s = c2392n.f18079r;
        this.f18118t = c2392n.f18080s;
        this.f18119u = c2392n.f18081t;
        this.f18120v = c2392n.f18082u;
        this.f18121w = c2392n.f18083v;
        int i10 = c2392n.f18084w;
        this.f18122x = i10 == -1 ? 0 : i10;
        float f5 = c2392n.f18085x;
        this.f18123y = f5 == -1.0f ? 1.0f : f5;
        this.f18124z = c2392n.f18086y;
        this.f18088A = c2392n.f18087z;
        this.f18089B = c2392n.f18053A;
        this.f18090C = c2392n.f18054B;
        this.f18091D = c2392n.f18055C;
        this.f18092E = c2392n.f18056D;
        this.f18093F = c2392n.f18057E;
        int i11 = c2392n.f18058F;
        this.f18094G = i11 == -1 ? 0 : i11;
        int i12 = c2392n.f18059G;
        this.f18095H = i12 != -1 ? i12 : 0;
        this.I = c2392n.f18060H;
        this.J = c2392n.I;
        this.f18096K = c2392n.J;
        this.f18097L = c2392n.f18061K;
        int i13 = c2392n.f18062L;
        if (i13 != 0 || c2389k == null) {
            this.f18098M = i13;
        } else {
            this.f18098M = 1;
        }
    }

    public static String c(C2393o c2393o) {
        String str;
        String str2;
        int i7;
        int i8 = 4;
        if (c2393o == null) {
            return "null";
        }
        F2.G g4 = new F2.G(String.valueOf(','));
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(c2393o.a);
        sb.append(", mimeType=");
        sb.append(c2393o.f18112n);
        String str3 = c2393o.f18111m;
        if (str3 != null) {
            sb.append(", container=");
            sb.append(str3);
        }
        int i9 = c2393o.f18108j;
        if (i9 != -1) {
            sb.append(", bitrate=");
            sb.append(i9);
        }
        String str4 = c2393o.f18109k;
        if (str4 != null) {
            sb.append(", codecs=");
            sb.append(str4);
        }
        C2389k c2389k = c2393o.f18116r;
        if (c2389k != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i10 = 0; i10 < c2389k.f18052n; i10++) {
                UUID uuid = c2389k.f18049k[i10].f18045l;
                if (uuid.equals(AbstractC2383e.f18031b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(AbstractC2383e.f18032c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(AbstractC2383e.f18034e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(AbstractC2383e.f18033d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(AbstractC2383e.a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            sb.append(", drm=[");
            g4.b(sb, linkedHashSet.iterator());
            sb.append(']');
        }
        int i11 = c2393o.f18119u;
        if (i11 != -1 && (i7 = c2393o.f18120v) != -1) {
            sb.append(", res=");
            sb.append(i11);
            sb.append("x");
            sb.append(i7);
        }
        float f5 = c2393o.f18123y;
        double d4 = f5;
        int i12 = l3.b.a;
        if (Math.copySign(d4 - 1.0d, 1.0d) > 0.001d && d4 != 1.0d && (!Double.isNaN(d4) || !Double.isNaN(1.0d))) {
            sb.append(", par=");
            Object[] objArr = {Float.valueOf(f5)};
            int i13 = B1.K.a;
            sb.append(String.format(Locale.US, "%.3f", objArr));
        }
        C2384f c2384f = c2393o.f18089B;
        if (c2384f != null) {
            int i14 = c2384f.f18040f;
            int i15 = c2384f.f18039e;
            if ((i15 != -1 && i14 != -1) || c2384f.d()) {
                sb.append(", color=");
                if (c2384f.d()) {
                    String strB = C2384f.b(c2384f.a);
                    String strA = C2384f.a(c2384f.f18036b);
                    String strC = C2384f.c(c2384f.f18037c);
                    Locale locale = Locale.US;
                    str2 = strB + "/" + strA + "/" + strC;
                } else {
                    str2 = "NA/NA/NA";
                }
                sb.append(str2 + "/" + ((i15 == -1 || i14 == -1) ? "NA/NA" : i15 + "/" + i14));
            }
        }
        float f7 = c2393o.f18121w;
        if (f7 != -1.0f) {
            sb.append(", fps=");
            sb.append(f7);
        }
        int i16 = c2393o.f18090C;
        if (i16 != -1) {
            sb.append(", maxSubLayers=");
            sb.append(i16);
        }
        int i17 = c2393o.f18091D;
        if (i17 != -1) {
            sb.append(", channels=");
            sb.append(i17);
        }
        int i18 = c2393o.f18092E;
        if (i18 != -1) {
            sb.append(", sample_rate=");
            sb.append(i18);
        }
        String str5 = c2393o.f18102d;
        if (str5 != null) {
            sb.append(", language=");
            sb.append(str5);
        }
        j3.G g7 = c2393o.f18101c;
        if (!g7.isEmpty()) {
            sb.append(", labels=[");
            g4.b(sb, AbstractC1331q.r(g7, new q2.d(i8)).iterator());
            sb.append("]");
        }
        int i19 = c2393o.f18103e;
        if (i19 != 0) {
            sb.append(", selectionFlags=[");
            int i20 = B1.K.a;
            ArrayList arrayList = new ArrayList();
            if ((i19 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i19 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i19 & 2) != 0) {
                arrayList.add("forced");
            }
            g4.b(sb, arrayList.iterator());
            sb.append("]");
        }
        int i21 = c2393o.f18104f;
        if (i21 != 0) {
            sb.append(", roleFlags=[");
            int i22 = B1.K.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i21 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i21 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i21 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i21 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i21 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i21 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i21 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i21 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i21 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i21 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i21 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i21 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i21 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i21 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i21 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i21 & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            g4.b(sb, arrayList2.iterator());
            sb.append("]");
        }
        if ((i21 & 32768) != 0) {
            sb.append(", auxiliaryTrackType=");
            int i23 = B1.K.a;
            int i24 = c2393o.f18105g;
            if (i24 == 0) {
                str = "undefined";
            } else if (i24 == 1) {
                str = "original";
            } else if (i24 == 2) {
                str = "depth-linear";
            } else if (i24 == 3) {
                str = "depth-inverse";
            } else {
                if (i24 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public final C2392n a() {
        C2392n c2392n = new C2392n();
        c2392n.a = this.a;
        c2392n.f18063b = this.f18100b;
        c2392n.f18064c = this.f18101c;
        c2392n.f18065d = this.f18102d;
        c2392n.f18066e = this.f18103e;
        c2392n.f18067f = this.f18104f;
        c2392n.f18069h = this.f18106h;
        c2392n.f18070i = this.f18107i;
        c2392n.f18071j = this.f18109k;
        c2392n.f18072k = this.f18110l;
        c2392n.f18073l = this.f18111m;
        c2392n.f18074m = this.f18112n;
        c2392n.f18075n = this.f18113o;
        c2392n.f18076o = this.f18114p;
        c2392n.f18077p = this.f18115q;
        c2392n.f18078q = this.f18116r;
        c2392n.f18079r = this.f18117s;
        c2392n.f18080s = this.f18118t;
        c2392n.f18081t = this.f18119u;
        c2392n.f18082u = this.f18120v;
        c2392n.f18083v = this.f18121w;
        c2392n.f18084w = this.f18122x;
        c2392n.f18085x = this.f18123y;
        c2392n.f18086y = this.f18124z;
        c2392n.f18087z = this.f18088A;
        c2392n.f18053A = this.f18089B;
        c2392n.f18054B = this.f18090C;
        c2392n.f18055C = this.f18091D;
        c2392n.f18056D = this.f18092E;
        c2392n.f18057E = this.f18093F;
        c2392n.f18058F = this.f18094G;
        c2392n.f18059G = this.f18095H;
        c2392n.f18060H = this.I;
        c2392n.I = this.J;
        c2392n.J = this.f18096K;
        c2392n.f18061K = this.f18097L;
        c2392n.f18062L = this.f18098M;
        return c2392n;
    }

    public final boolean b(C2393o c2393o) {
        List list = this.f18115q;
        if (list.size() != c2393o.f18115q.size()) {
            return false;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (!Arrays.equals((byte[]) list.get(i7), (byte[]) c2393o.f18115q.get(i7))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i7;
        if (this == obj) {
            return true;
        }
        if (obj == null || C2393o.class != obj.getClass()) {
            return false;
        }
        C2393o c2393o = (C2393o) obj;
        int i8 = this.f18099N;
        return (i8 == 0 || (i7 = c2393o.f18099N) == 0 || i8 == i7) && this.f18103e == c2393o.f18103e && this.f18104f == c2393o.f18104f && this.f18105g == c2393o.f18105g && this.f18106h == c2393o.f18106h && this.f18107i == c2393o.f18107i && this.f18113o == c2393o.f18113o && this.f18117s == c2393o.f18117s && this.f18119u == c2393o.f18119u && this.f18120v == c2393o.f18120v && this.f18122x == c2393o.f18122x && this.f18088A == c2393o.f18088A && this.f18090C == c2393o.f18090C && this.f18091D == c2393o.f18091D && this.f18092E == c2393o.f18092E && this.f18093F == c2393o.f18093F && this.f18094G == c2393o.f18094G && this.f18095H == c2393o.f18095H && this.I == c2393o.I && this.f18096K == c2393o.f18096K && this.f18097L == c2393o.f18097L && this.f18098M == c2393o.f18098M && Float.compare(this.f18121w, c2393o.f18121w) == 0 && Float.compare(this.f18123y, c2393o.f18123y) == 0 && Objects.equals(this.a, c2393o.a) && Objects.equals(this.f18100b, c2393o.f18100b) && this.f18101c.equals(c2393o.f18101c) && Objects.equals(this.f18109k, c2393o.f18109k) && Objects.equals(this.f18111m, c2393o.f18111m) && Objects.equals(this.f18112n, c2393o.f18112n) && Objects.equals(this.f18102d, c2393o.f18102d) && Arrays.equals(this.f18124z, c2393o.f18124z) && Objects.equals(this.f18110l, c2393o.f18110l) && Objects.equals(this.f18089B, c2393o.f18089B) && Objects.equals(this.f18116r, c2393o.f18116r) && b(c2393o);
    }

    public final int hashCode() {
        if (this.f18099N == 0) {
            String str = this.a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f18100b;
            int iHashCode2 = (this.f18101c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.f18102d;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f18103e) * 31) + this.f18104f) * 31) + this.f18105g) * 31) + this.f18106h) * 31) + this.f18107i) * 31;
            String str4 = this.f18109k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            C c2 = this.f18110l;
            int iHashCode5 = (iHashCode4 + (c2 == null ? 0 : c2.hashCode())) * 961;
            String str5 = this.f18111m;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f18112n;
            this.f18099N = ((((((((((((((((((((((Float.floatToIntBits(this.f18123y) + ((((Float.floatToIntBits(this.f18121w) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f18113o) * 31) + ((int) this.f18117s)) * 31) + this.f18119u) * 31) + this.f18120v) * 31)) * 31) + this.f18122x) * 31)) * 31) + this.f18088A) * 31) + this.f18090C) * 31) + this.f18091D) * 31) + this.f18092E) * 31) + this.f18093F) * 31) + this.f18094G) * 31) + this.f18095H) * 31) + this.I) * 31) + this.f18096K) * 31) + this.f18097L) * 31) + this.f18098M;
        }
        return this.f18099N;
    }

    public final String toString() {
        return "Format(" + this.a + ", " + this.f18100b + ", " + this.f18111m + ", " + this.f18112n + ", " + this.f18109k + ", " + this.f18108j + ", " + this.f18102d + ", [" + this.f18119u + ", " + this.f18120v + ", " + this.f18121w + ", " + this.f18089B + "], [" + this.f18091D + ", " + this.f18092E + "])";
    }
}
