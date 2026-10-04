package V1;

import C2.C0029b;
import C2.C0031d;
import C2.C0032e;
import C2.C0034g;
import C2.I;
import a2.C0661b;
import android.net.Uri;
import b2.C0706b;
import io.ktor.util.GzipHeaderFlags;
import j3.X;
import java.util.ArrayList;
import java.util.HashMap;
import p.I0;

/* loaded from: classes.dex */
public final class l implements q {

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f9396o = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: p, reason: collision with root package name */
    public static final L2.e f9397p = new L2.e(new I1.e(13));

    /* renamed from: q, reason: collision with root package name */
    public static final L2.e f9398q = new L2.e(new I1.e(14));

    /* renamed from: k, reason: collision with root package name */
    public X f9399k;

    /* renamed from: n, reason: collision with root package name */
    public int f9402n;

    /* renamed from: m, reason: collision with root package name */
    public I0 f9401m = new I0(10);

    /* renamed from: l, reason: collision with root package name */
    public boolean f9400l = true;

    @Override // V1.q
    public final synchronized n[] a() {
        return e(Uri.EMPTY, new HashMap());
    }

    public final void b(int i7, ArrayList arrayList) {
        switch (i7) {
            case 0:
                arrayList.add(new C0029b());
                break;
            case 1:
                arrayList.add(new C0031d());
                break;
            case 2:
                arrayList.add(new C0032e());
                break;
            case 3:
                arrayList.add(new W1.a());
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                n nVarI1 = f9397p.i1(0);
                if (nVarI1 == null) {
                    arrayList.add(new C0661b());
                    break;
                } else {
                    arrayList.add(nVarI1);
                    break;
                }
            case 5:
                arrayList.add(new C0706b());
                break;
            case 6:
                arrayList.add(new n2.d(this.f9401m, this.f9400l ? 0 : 2));
                break;
            case 7:
                arrayList.add(new o2.d());
                break;
            case 8:
                arrayList.add(new p2.h(this.f9401m, this.f9400l ? 0 : 32));
                arrayList.add(new p2.k(this.f9401m, this.f9400l ? 0 : 16));
                break;
            case 9:
                arrayList.add(new q2.e());
                break;
            case 10:
                arrayList.add(new C2.D());
                break;
            case 11:
                if (this.f9399k == null) {
                    j3.E e7 = j3.G.f12277l;
                    this.f9399k = X.f12304o;
                }
                arrayList.add(new I(!this.f9400l ? 1 : 0, this.f9401m, new B1.H(0L), new C0034g(0, this.f9399k)));
                break;
            case 12:
                arrayList.add(new D2.d());
                break;
            case 14:
                arrayList.add(new Z1.a(this.f9402n));
                break;
            case 15:
                n nVarI12 = f9398q.i1(new Object[0]);
                if (nVarI12 != null) {
                    arrayList.add(nVarI12);
                    break;
                }
                break;
            case 16:
                arrayList.add(new X1.b(!this.f9400l ? 1 : 0, this.f9401m));
                break;
            case 17:
                arrayList.add(new Z1.a(1, (byte) 0));
                break;
            case 18:
                arrayList.add(new E2.a(0));
                break;
            case 19:
                arrayList.add(new Z1.a(0, (byte) 0));
                break;
            case 20:
                arrayList.add(new E2.a(2));
                break;
            case 21:
                arrayList.add(new E2.a(1));
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0230 A[Catch: all -> 0x024c, TRY_ENTER, TryCatch #0 {all -> 0x024c, blocks: (B:4:0x001f, B:6:0x0032, B:9:0x0039, B:168:0x0230, B:169:0x0233, B:172:0x023b, B:174:0x0240, B:177:0x0246, B:178:0x0249, B:181:0x024e, B:13:0x0045), top: B:186:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0240 A[Catch: all -> 0x024c, TryCatch #0 {all -> 0x024c, blocks: (B:4:0x001f, B:6:0x0032, B:9:0x0039, B:168:0x0230, B:169:0x0233, B:172:0x023b, B:174:0x0240, B:177:0x0246, B:178:0x0249, B:181:0x024e, B:13:0x0045), top: B:186:0x001f }] */
    @Override // V1.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized V1.n[] e(android.net.Uri r22, java.util.Map r23) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.l.e(android.net.Uri, java.util.Map):V1.n[]");
    }
}
