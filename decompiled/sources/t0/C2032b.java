package t0;

import D6.r;
import f6.AbstractC0905c;
import io.ktor.client.utils.CIOKt;
import p.AbstractC1755i;
import x.C2228b;
import x.C2236j;
import x.C2240n;
import x.o;
import x.p;
import x.s;

/* renamed from: t0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2032b {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public int f15881b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15882c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15883d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f15884e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f15885f;

    public C2032b(p pVar, int i7, int i8, C2236j c2236j, s sVar) {
        this.f15885f = pVar;
        this.f15882c = pVar;
        this.a = i7;
        this.f15881b = i8;
        this.f15883d = c2236j;
        this.f15884e = sVar;
    }

    public void a(float f5, long j7) {
        int i7 = (this.f15881b + 1) % 20;
        this.f15881b = i7;
        C2031a[] c2031aArr = (C2031a[]) this.f15882c;
        C2031a c2031a = c2031aArr[i7];
        if (c2031a != null) {
            c2031a.a = j7;
            c2031a.f15880b = f5;
        } else {
            C2031a c2031a2 = new C2031a();
            c2031a2.a = j7;
            c2031a2.f15880b = f5;
            c2031aArr[i7] = c2031a2;
        }
    }

    public float b(float f5) {
        float[] fArr;
        float[] fArr2;
        float f7;
        float fSignum;
        float f8 = f5;
        float f9 = 0.0f;
        if (f8 <= 0.0f) {
            AbstractC0905c.C("maximumVelocity should be a positive value. You specified=" + f8);
            throw null;
        }
        int i7 = this.f15881b;
        C2031a[] c2031aArr = (C2031a[]) this.f15882c;
        C2031a c2031a = c2031aArr[i7];
        if (c2031a == null) {
            f7 = 0.0f;
        } else {
            int i8 = 0;
            C2031a c2031a2 = c2031a;
            while (true) {
                C2031a c2031a3 = c2031aArr[i7];
                fArr = (float[]) this.f15883d;
                fArr2 = (float[]) this.f15884e;
                if (c2031a3 == null) {
                    f7 = f9;
                    break;
                }
                long j7 = c2031a.a;
                long j8 = c2031a3.a;
                float f10 = j7 - j8;
                f7 = f9;
                int i9 = i7;
                float fAbs = Math.abs(j8 - c2031a2.a);
                if (f10 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i8] = c2031a3.f15880b;
                fArr2[i8] = -f10;
                i7 = (i9 == 0 ? 20 : i9) - 1;
                i8++;
                if (i8 >= 20) {
                    break;
                }
                c2031a2 = c2031a3;
                f9 = f7;
            }
            if (i8 >= this.a) {
                int iB = AbstractC1755i.b(1);
                if (iB == 0) {
                    try {
                        float[] fArr3 = (float[]) this.f15885f;
                        AbstractC0905c.x(fArr2, fArr, i8, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f7;
                    }
                } else {
                    if (iB != 1) {
                        throw new r();
                    }
                    int i10 = i8 - 1;
                    float f11 = fArr2[i10];
                    int i11 = i10;
                    float fAbs2 = f7;
                    while (i11 > 0) {
                        int i12 = i11 - 1;
                        float f12 = fArr2[i12];
                        if (f11 != f12) {
                            float f13 = (fArr[i11] - fArr[i12]) / (f11 - f12);
                            fAbs2 += Math.abs(f13) * (f13 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2))));
                            if (i11 == i10) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i11--;
                        f11 = f12;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2));
                }
                f9 = fSignum * CIOKt.DEFAULT_HTTP_POOL_SIZE;
            } else {
                f9 = f7;
            }
        }
        if (f9 == f7 || Float.isNaN(f9)) {
            return f7;
        }
        if (f9 <= f7) {
            f8 = -f8;
            if (f9 >= f8) {
                return f9;
            }
        } else if (f9 <= f8) {
            f8 = f9;
        }
        return f8;
    }

    public long c(int i7, int i8) {
        int i9;
        p pVar = (p) this.f15882c;
        int[] iArr = pVar.a;
        if (i8 == 1) {
            i9 = iArr[i7];
        } else {
            int i10 = (i8 + i7) - 1;
            int[] iArr2 = pVar.f17260b;
            i9 = (iArr2[i10] + iArr[i10]) - iArr2[i7];
        }
        if (i9 < 0) {
            i9 = 0;
        }
        if (i9 >= 0) {
            return q0.c.x(i9, i9, 0, Integer.MAX_VALUE);
        }
        android.support.v4.media.session.b.H("width(" + i9 + ") must be >= 0");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    public o d(int i7) {
        F5.o oVarB = ((s) this.f15884e).b(i7);
        ?? r52 = oVarB.f2542m;
        int size = r52.size();
        int i8 = oVarB.f2541l;
        int i9 = (size == 0 || i8 + size == this.a) ? 0 : this.f15881b;
        C2240n[] c2240nArr = new C2240n[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = (int) ((C2228b) r52.get(i11)).a;
            int i13 = i9;
            C2240n c2240nA = ((C2236j) this.f15883d).a(i8 + i11, c(i10, i12), i10, i12, i13);
            i9 = i13;
            i10 += i12;
            c2240nArr[i11] = c2240nA;
        }
        return new o(i7, c2240nArr, (p) this.f15885f, r52, i9);
    }

    public C2032b() {
        int i7;
        int iB = AbstractC1755i.b(1);
        if (iB == 0) {
            i7 = 3;
        } else {
            if (iB != 1) {
                throw new r();
            }
            i7 = 2;
        }
        this.a = i7;
        this.f15882c = new C2031a[20];
        this.f15883d = new float[20];
        this.f15884e = new float[20];
        this.f15885f = new float[3];
    }
}
