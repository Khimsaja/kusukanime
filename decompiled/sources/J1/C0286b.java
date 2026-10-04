package J1;

import B1.K;
import C2.C0034g;
import C2.H;
import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseArray;
import j3.AbstractC1331q;
import j3.X;
import j3.c0;
import java.util.Objects;
import y1.C2381c;

/* renamed from: J1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286b {

    /* renamed from: c, reason: collision with root package name */
    public static final C0286b f4183c = new C0286b(j3.G.w(C0285a.f4180d));

    /* renamed from: d, reason: collision with root package name */
    public static final X f4184d;

    /* renamed from: e, reason: collision with root package name */
    public static final c0 f4185e;
    public final SparseArray a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final int f4186b;

    static {
        Object[] objArr = {2, 5, 6};
        AbstractC1331q.a(3, objArr);
        f4184d = j3.G.q(3, objArr);
        H h7 = new H(4);
        h7.m(5, 6);
        h7.m(17, 6);
        h7.m(7, 6);
        h7.m(30, 10);
        h7.m(18, 6);
        h7.m(6, 8);
        h7.m(8, 8);
        h7.m(14, 8);
        f4185e = h7.c();
    }

    public C0286b(X x7) {
        for (int i7 = 0; i7 < x7.f12306n; i7++) {
            C0285a c0285a = (C0285a) x7.get(i7);
            this.a.put(c0285a.a, c0285a);
        }
        int iMax = 0;
        for (int i8 = 0; i8 < this.a.size(); i8++) {
            iMax = Math.max(iMax, ((C0285a) this.a.valueAt(i8)).f4181b);
        }
        this.f4186b = iMax;
    }

    public static X a(int[] iArr, int i7) {
        j3.D dR = j3.G.r();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i8 : iArr) {
            dR.a(new C0285a(i8, i7));
        }
        return dR.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x026c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static J1.C0286b b(android.content.Context r16, android.content.Intent r17, y1.C2381c r18, C2.C0034g r19) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.C0286b.b(android.content.Context, android.content.Intent, y1.c, C2.g):J1.b");
    }

    public static C0286b c(Context context, C2381c c2381c, C0034g c0034g) {
        return b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c2381c, c0034g);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair d(y1.C2393o r17, y1.C2381c r18) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.C0286b.d(y1.o, y1.c):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        boolean zContentEquals;
        if (this != obj) {
            if (obj instanceof C0286b) {
                C0286b c0286b = (C0286b) obj;
                SparseArray sparseArray = this.a;
                SparseArray sparseArray2 = c0286b.a;
                int i7 = K.a;
                if (sparseArray != null) {
                    if (sparseArray2 != null) {
                        if (K.a >= 31) {
                            zContentEquals = sparseArray.contentEquals(sparseArray2);
                        } else {
                            int size = sparseArray.size();
                            if (size == sparseArray2.size()) {
                                for (int i8 = 0; i8 < size; i8++) {
                                    if (Objects.equals(sparseArray.valueAt(i8), sparseArray2.get(sparseArray.keyAt(i8)))) {
                                    }
                                }
                                zContentEquals = true;
                            }
                        }
                    }
                    zContentEquals = false;
                    break;
                } else {
                    if (sparseArray2 != null) {
                        zContentEquals = false;
                        break;
                    }
                    zContentEquals = true;
                }
                if (!zContentEquals || this.f4186b != c0286b.f4186b) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iContentHashCode;
        SparseArray sparseArray = this.a;
        if (K.a >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i7)) + ((sparseArray.keyAt(i7) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return (iContentHashCode * 31) + this.f4186b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f4186b + ", audioProfiles=" + this.a + "]";
    }
}
