package C2;

import B1.AbstractC0015b;
import B1.AbstractC0018e;
import D.W;
import D6.InterfaceC0120n;
import F2.N;
import H.S;
import H1.C0221b;
import O.C0486d;
import O.C0493g0;
import O.R0;
import O.T;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.kusukanime.R;
import e5.AbstractC0832b;
import f6.AbstractC0897K;
import g1.RunnableC0933a;
import io.ktor.util.GzipHeaderFlags;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import m.AbstractC1475E;
import m.C1472B;
import m.C1504y;
import p.I0;
import u4.M;
import y1.AbstractC2383e;
import y1.C2392n;
import y1.C2393o;

/* renamed from: C2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034g implements InterfaceC0120n, N, I2.d, L1.c, P1.c, M {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f740k;

    /* renamed from: l, reason: collision with root package name */
    public Object f741l;

    public /* synthetic */ C0034g(int i7, Object obj) {
        this.f740k = i7;
        this.f741l = obj;
    }

    @Override // D6.InterfaceC0120n
    public Object a(Object obj) {
        return Optional.ofNullable(((InterfaceC0120n) this.f741l).a((AbstractC0897K) obj));
    }

    @Override // I2.d
    public void b(int i7, Serializable serializable) {
        String str;
        switch (i7) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i7 == 6 || i7 == 7 || i7 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f741l).setResultCode(i7);
    }

    public void d(Object obj, Object obj2) {
        C1504y c1504y = (C1504y) this.f741l;
        int iD = c1504y.d(obj);
        boolean z7 = iD < 0;
        Object obj3 = z7 ? null : c1504y.f12941c[iD];
        if (obj3 != null) {
            if (obj3 instanceof C1472B) {
                ((C1472B) obj3).a(obj2);
            } else if (obj3 != obj2) {
                C1472B c1472b = new C1472B();
                c1472b.a(obj3);
                c1472b.a(obj2);
                obj2 = c1472b;
            }
            obj2 = obj3;
        }
        if (!z7) {
            c1504y.f12941c[iD] = obj2;
            return;
        }
        int i7 = ~iD;
        c1504y.f12940b[i7] = obj;
        c1504y.f12941c[i7] = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String e(y1.C2393o r7) throws android.content.res.Resources.NotFoundException {
        /*
            r6 = this;
            java.lang.String r0 = r7.f18102d
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = ""
            if (r1 != 0) goto L32
            java.lang.String r1 = "und"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L13
            goto L32
        L13:
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
            int r1 = B1.K.a
            r3 = 24
            if (r1 < r3) goto L24
            java.util.Locale$Category r1 = java.util.Locale.Category.DISPLAY
            java.util.Locale r1 = java.util.Locale.getDefault(r1)
            goto L28
        L24:
            java.util.Locale r1 = java.util.Locale.getDefault()
        L28:
            java.lang.String r0 = r0.getDisplayName(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L34
        L32:
            r0 = r2
            goto L55
        L34:
            r3 = 1
            r4 = 0
            int r3 = r0.offsetByCodePoints(r4, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L55
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.IndexOutOfBoundsException -> L55
            r5.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L55
            java.lang.String r4 = r0.substring(r4, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L55
            java.lang.String r1 = r4.toUpperCase(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L55
            r5.append(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L55
            java.lang.String r1 = r0.substring(r3)     // Catch: java.lang.IndexOutOfBoundsException -> L55
            r5.append(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L55
            java.lang.String r0 = r5.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L55
        L55:
            java.lang.String r1 = r6.f(r7)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.lang.String r0 = r6.p(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L72
            java.lang.String r7 = r7.f18100b
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L70
            goto L71
        L70:
            r2 = r7
        L71:
            r0 = r2
        L72:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.C0034g.e(y1.o):java.lang.String");
    }

    public String f(C2393o c2393o) throws Resources.NotFoundException {
        int i7 = c2393o.f18104f & 2;
        Resources resources = (Resources) this.f741l;
        String string = i7 != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        int i8 = c2393o.f18104f;
        if ((i8 & 4) != 0) {
            string = p(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i8 & 8) != 0) {
            string = p(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i8 & 1088) != 0 ? p(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    @Override // I2.d
    public void g() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public V2.i h() {
        V2.d dVarG;
        C0221b c0221b = (C0221b) this.f741l;
        V2.g gVar = (V2.g) c0221b.f3407n;
        synchronized (gVar) {
            c0221b.a(true);
            dVarG = gVar.g(((V2.c) c0221b.f3405l).a);
        }
        if (dVarG != null) {
            return new V2.i(dVarG);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6 */
    public List i(H h7) {
        String str;
        int i7;
        List listSingletonList;
        B1.B b4 = new B1.B((byte[]) h7.f668n);
        ArrayList arrayList = (j3.G) this.f741l;
        while (b4.a() > 0) {
            int iT = b4.t();
            int iT2 = b4.f288b + b4.t();
            if (iT == 134) {
                arrayList = new ArrayList();
                int iT3 = b4.t() & 31;
                for (int i8 = 0; i8 < iT3; i8++) {
                    String strR = b4.r(3, StandardCharsets.UTF_8);
                    int iT4 = b4.t();
                    boolean z7 = (iT4 & 128) != 0;
                    if (z7) {
                        i7 = iT4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i7 = 1;
                    }
                    byte bT = (byte) b4.t();
                    b4.G(1);
                    if (z7) {
                        boolean z8 = (bT & 64) != 0;
                        byte[] bArr = AbstractC0018e.a;
                        listSingletonList = Collections.singletonList(z8 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    C2392n c2392n = new C2392n();
                    c2392n.f18074m = y1.D.m(str);
                    c2392n.f18065d = strR;
                    c2392n.f18060H = i7;
                    c2392n.f18077p = listSingletonList;
                    arrayList.add(new C2393o(c2392n));
                }
            }
            b4.F(iT2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public G1.a j() {
        return null;
    }

    public K1.c k() {
        return (K1.c) this.f741l;
    }

    public R0 l() {
        p1.g gVarA = p1.g.a();
        if (gVarA.b() == 1) {
            return new P0.k(true);
        }
        C0493g0 c0493g0K = C0486d.K(Boolean.FALSE, T.f7049p);
        P0.g gVar = new P0.g(c0493g0K, this);
        gVarA.a.writeLock().lock();
        try {
            if (gVarA.f14171c == 1 || gVarA.f14171c == 2) {
                gVarA.f14172d.post(new RunnableC0933a(Arrays.asList(gVar), gVarA.f14171c, null));
            } else {
                gVarA.f14170b.add(gVar);
            }
            gVarA.a.writeLock().unlock();
            return c0493g0K;
        } catch (Throwable th) {
            gVarA.a.writeLock().unlock();
            throw th;
        }
    }

    public UUID m() {
        return AbstractC2383e.a;
    }

    public int n() {
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String o(y1.C2393o r15) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.C0034g.o(y1.o):java.lang.String");
    }

    public String p(String... strArr) throws Resources.NotFoundException {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : ((Resources) this.f741l).getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    public void q(Exception exc) {
        AbstractC0015b.n("MediaCodecAudioRenderer", "Audio sink error", exc);
        J1.j jVar = ((J1.C) this.f741l).f4142N0;
        Handler handler = jVar.a;
        if (handler != null) {
            handler.post(new J1.h(jVar, exc, 3));
        }
    }

    public boolean t(Object obj, Object obj2) {
        C1504y c1504y = (C1504y) this.f741l;
        Object objE = c1504y.e(obj);
        if (objE == null) {
            return false;
        }
        if (!(objE instanceof C1472B)) {
            if (!objE.equals(obj2)) {
                return false;
            }
            c1504y.g(obj);
            return true;
        }
        C1472B c1472b = (C1472B) objE;
        boolean zJ = c1472b.j(obj2);
        if (zJ && c1472b.g()) {
            c1504y.g(obj);
        }
        return zJ;
    }

    public String toString() {
        switch (this.f740k) {
            case 25:
                StringBuilder sb = new StringBuilder();
                L4.q qVar = (L4.q) this.f741l;
                sb.append(qVar);
                sb.append(": ");
                sb.append(((Map) AbstractC0832b.u(qVar.f6125s, L4.q.f6122w[0])).keySet());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(Object obj) {
        boolean zG;
        C1504y c1504y = (C1504y) this.f741l;
        long[] jArr = c1504y.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j7 = jArr[i7];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        int i10 = (i7 << 3) + i9;
                        Object obj2 = c1504y.f12940b[i10];
                        Object obj3 = c1504y.f12941c[i10];
                        if (obj3 instanceof C1472B) {
                            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>", obj3);
                            C1472B c1472b = (C1472B) obj3;
                            c1472b.j(obj);
                            zG = c1472b.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            c1504y.h(i10);
                        }
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return;
                }
            }
            if (i7 == length) {
                return;
            } else {
                i7++;
            }
        }
    }

    public boolean v(String str) {
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
    
        if (r2 >= 26) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0078, code lost:
    
        if (r2 >= 34) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int w(y1.C2393o r7) {
        /*
            r6 = this;
            r0 = 4
            r1 = 1
            java.lang.String r2 = r7.f18112n
            r3 = 0
            if (r2 == 0) goto L84
            boolean r2 = y1.D.j(r2)
            if (r2 != 0) goto Lf
            goto L84
        Lf:
            int r2 = B1.K.a
            java.lang.String r7 = r7.f18112n
            r7.getClass()
            int r2 = B1.K.a
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -1487656890: goto L63;
                case -1487464693: goto L58;
                case -1487464690: goto L4d;
                case -1487394660: goto L42;
                case -1487018032: goto L37;
                case -879272239: goto L2c;
                case -879258763: goto L21;
                default: goto L20;
            }
        L20:
            goto L6d
        L21:
            java.lang.String r5 = "image/png"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L2a
            goto L6d
        L2a:
            r4 = 6
            goto L6d
        L2c:
            java.lang.String r5 = "image/bmp"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L35
            goto L6d
        L35:
            r4 = 5
            goto L6d
        L37:
            java.lang.String r5 = "image/webp"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L40
            goto L6d
        L40:
            r4 = r0
            goto L6d
        L42:
            java.lang.String r5 = "image/jpeg"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L4b
            goto L6d
        L4b:
            r4 = 3
            goto L6d
        L4d:
            java.lang.String r5 = "image/heif"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L56
            goto L6d
        L56:
            r4 = 2
            goto L6d
        L58:
            java.lang.String r5 = "image/heic"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L61
            goto L6d
        L61:
            r4 = r1
            goto L6d
        L63:
            java.lang.String r5 = "image/avif"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L6c
            goto L6d
        L6c:
            r4 = r3
        L6d:
            switch(r4) {
                case 0: goto L76;
                case 1: goto L71;
                case 2: goto L71;
                case 3: goto L7a;
                case 4: goto L7a;
                case 5: goto L7a;
                case 6: goto L7a;
                default: goto L70;
            }
        L70:
            goto L7f
        L71:
            r7 = 26
            if (r2 < r7) goto L7f
            goto L7a
        L76:
            r7 = 34
            if (r2 < r7) goto L7f
        L7a:
            int r7 = H1.AbstractC0225f.f(r0, r3, r3, r3)
            return r7
        L7f:
            int r7 = H1.AbstractC0225f.f(r1, r3, r3, r3)
            return r7
        L84:
            int r7 = H1.AbstractC0225f.f(r3, r3, r3, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.C0034g.w(y1.o):int");
    }

    public void x(N0.w wVar, long j7, boolean z7, C0028a c0028a) {
        ((S) this.f741l).n(H0.H.b(S.a((S) this.f741l, wVar, j7, z7, false, c0028a, false)) ? W.f1109m : W.f1108l);
    }

    public /* synthetic */ C0034g(int i7, boolean z7) {
        this.f740k = i7;
    }

    public C0034g(L4.q qVar) {
        this.f740k = 25;
        kotlin.jvm.internal.l.f("packageFragment", qVar);
        this.f741l = qVar;
    }

    public C0034g(Resources resources) {
        this.f740k = 4;
        resources.getClass();
        this.f741l = resources;
    }

    public C0034g(int i7) {
        A.e eVar;
        int i8 = 10;
        boolean z7 = false;
        this.f740k = i7;
        switch (i7) {
            case 17:
                this.f741l = new I1.e(4);
                break;
            case 18:
                if (Build.VERSION.SDK_INT >= 28) {
                    eVar = new A.e(18);
                } else {
                    eVar = new A.e(19);
                }
                this.f741l = eVar;
                break;
            case 23:
                this.f741l = new I0(i8);
                break;
            case 26:
                this.f741l = new SparseArray(10);
                break;
            case 27:
                long[] jArr = AbstractC1475E.a;
                this.f741l = new C1504y();
                break;
            default:
                this.f741l = new C0034g(6, z7);
                break;
        }
    }

    public void r() {
    }

    public void c(K1.e eVar) {
    }

    public void s(K1.e eVar) {
    }
}
