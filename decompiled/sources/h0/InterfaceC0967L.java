package h0;

import android.graphics.Path;
import android.graphics.RectF;
import g0.AbstractC0932a;
import p.AbstractC1755i;

/* renamed from: h0.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0967L {
    static void a(InterfaceC0967L interfaceC0967L, g0.e eVar) {
        Path.Direction direction;
        C0987j c0987j = (C0987j) interfaceC0967L;
        if (c0987j.f11823b == null) {
            c0987j.f11823b = new RectF();
        }
        RectF rectF = c0987j.f11823b;
        kotlin.jvm.internal.l.c(rectF);
        float f5 = eVar.f11664d;
        rectF.set(eVar.a, eVar.f11662b, eVar.f11663c, f5);
        if (c0987j.f11824c == null) {
            c0987j.f11824c = new float[8];
        }
        float[] fArr = c0987j.f11824c;
        kotlin.jvm.internal.l.c(fArr);
        long j7 = eVar.f11665e;
        fArr[0] = AbstractC0932a.b(j7);
        fArr[1] = AbstractC0932a.c(j7);
        long j8 = eVar.f11666f;
        fArr[2] = AbstractC0932a.b(j8);
        fArr[3] = AbstractC0932a.c(j8);
        long j9 = eVar.f11667g;
        fArr[4] = AbstractC0932a.b(j9);
        fArr[5] = AbstractC0932a.c(j9);
        long j10 = eVar.f11668h;
        fArr[6] = AbstractC0932a.b(j10);
        fArr[7] = AbstractC0932a.c(j10);
        RectF rectF2 = c0987j.f11823b;
        kotlin.jvm.internal.l.c(rectF2);
        float[] fArr2 = c0987j.f11824c;
        kotlin.jvm.internal.l.c(fArr2);
        int iB = AbstractC1755i.b(1);
        if (iB == 0) {
            direction = Path.Direction.CCW;
        } else {
            if (iB != 1) {
                throw new D6.r();
            }
            direction = Path.Direction.CW;
        }
        c0987j.a.addRoundRect(rectF2, fArr2, direction);
    }

    static void b(InterfaceC0967L interfaceC0967L, g0.d dVar) {
        Path.Direction direction;
        C0987j c0987j = (C0987j) interfaceC0967L;
        float f5 = dVar.a;
        if (!Float.isNaN(f5)) {
            float f7 = dVar.f11659b;
            if (!Float.isNaN(f7)) {
                float f8 = dVar.f11660c;
                if (!Float.isNaN(f8)) {
                    float f9 = dVar.f11661d;
                    if (!Float.isNaN(f9)) {
                        if (c0987j.f11823b == null) {
                            c0987j.f11823b = new RectF();
                        }
                        RectF rectF = c0987j.f11823b;
                        kotlin.jvm.internal.l.c(rectF);
                        rectF.set(f5, f7, f8, f9);
                        RectF rectF2 = c0987j.f11823b;
                        kotlin.jvm.internal.l.c(rectF2);
                        int iB = AbstractC1755i.b(1);
                        if (iB == 0) {
                            direction = Path.Direction.CCW;
                        } else {
                            if (iB != 1) {
                                throw new D6.r();
                            }
                            direction = Path.Direction.CW;
                        }
                        c0987j.a.addRect(rectF2, direction);
                        return;
                    }
                }
            }
        }
        throw new IllegalStateException("Invalid rectangle, make sure no value is NaN");
    }
}
