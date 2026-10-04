package h0;

import android.graphics.ColorSpace;
import i0.AbstractC1019c;
import i0.C1020d;
import i0.C1032p;
import i0.C1033q;
import i0.C1034r;
import i0.C1035s;
import i0.InterfaceC1025i;
import java.util.function.DoubleUnaryOperator;

/* renamed from: h0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0956A {
    public static final ColorSpace a(AbstractC1019c abstractC1019c) {
        if (kotlin.jvm.internal.l.a(abstractC1019c, C1020d.f11869c)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (kotlin.jvm.internal.l.a(abstractC1019c, C1020d.f11881o)) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (kotlin.jvm.internal.l.a(abstractC1019c, C1020d.f11882p)) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (kotlin.jvm.internal.l.a(abstractC1019c, C1020d.f11879m)) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (kotlin.jvm.internal.l.a(abstractC1019c, C1020d.f11874h)) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (kotlin.jvm.internal.l.a(abstractC1019c, C1020d.f11873g)) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (kotlin.jvm.internal.l.a(abstractC1019c, C1020d.f11884r)) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (kotlin.jvm.internal.l.a(abstractC1019c, C1020d.f11883q)) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (kotlin.jvm.internal.l.a(abstractC1019c, C1020d.f11875i)) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (kotlin.jvm.internal.l.a(abstractC1019c, C1020d.f11876j)) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (kotlin.jvm.internal.l.a(abstractC1019c, C1020d.f11871e)) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (kotlin.jvm.internal.l.a(abstractC1019c, C1020d.f11872f)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (kotlin.jvm.internal.l.a(abstractC1019c, C1020d.f11870d)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (kotlin.jvm.internal.l.a(abstractC1019c, C1020d.f11877k)) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (kotlin.jvm.internal.l.a(abstractC1019c, C1020d.f11880n)) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (kotlin.jvm.internal.l.a(abstractC1019c, C1020d.f11878l)) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (!(abstractC1019c instanceof C1033q)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        C1033q c1033q = (C1033q) abstractC1019c;
        float[] fArrA = c1033q.f11912d.a();
        C1034r c1034r = c1033q.f11915g;
        ColorSpace.Rgb.TransferParameters transferParameters = c1034r != null ? new ColorSpace.Rgb.TransferParameters(c1034r.f11926b, c1034r.f11927c, c1034r.f11928d, c1034r.f11929e, c1034r.f11930f, c1034r.f11931g, c1034r.a) : null;
        if (transferParameters != null) {
            return new ColorSpace.Rgb(abstractC1019c.a, c1033q.f11916h, fArrA, transferParameters);
        }
        String str = abstractC1019c.a;
        final C1032p c1032p = c1033q.f11920l;
        final int i7 = 0;
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: h0.y
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d4) {
                switch (i7) {
                    case 0:
                        return ((Number) ((C1032p) c1032p).invoke(Double.valueOf(d4))).doubleValue();
                    default:
                        return ((Number) ((C1032p) c1032p).invoke(Double.valueOf(d4))).doubleValue();
                }
            }
        };
        final C1032p c1032p2 = c1033q.f11923o;
        final int i8 = 1;
        C1033q c1033q2 = (C1033q) abstractC1019c;
        return new ColorSpace.Rgb(str, c1033q.f11916h, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: h0.y
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d4) {
                switch (i8) {
                    case 0:
                        return ((Number) ((C1032p) c1032p2).invoke(Double.valueOf(d4))).doubleValue();
                    default:
                        return ((Number) ((C1032p) c1032p2).invoke(Double.valueOf(d4))).doubleValue();
                }
            }
        }, c1033q2.f11913e, c1033q2.f11914f);
    }

    public static final AbstractC1019c b(final ColorSpace colorSpace) {
        C1035s c1035s;
        int id = colorSpace.getId();
        ColorSpace.Named unused = ColorSpace.Named.SRGB;
        if (id == ColorSpace.Named.SRGB.ordinal()) {
            return C1020d.f11869c;
        }
        ColorSpace.Named unused2 = ColorSpace.Named.ACES;
        if (id == ColorSpace.Named.ACES.ordinal()) {
            return C1020d.f11881o;
        }
        ColorSpace.Named unused3 = ColorSpace.Named.ACESCG;
        if (id == ColorSpace.Named.ACESCG.ordinal()) {
            return C1020d.f11882p;
        }
        ColorSpace.Named unused4 = ColorSpace.Named.ADOBE_RGB;
        if (id == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return C1020d.f11879m;
        }
        ColorSpace.Named unused5 = ColorSpace.Named.BT2020;
        if (id == ColorSpace.Named.BT2020.ordinal()) {
            return C1020d.f11874h;
        }
        ColorSpace.Named unused6 = ColorSpace.Named.BT709;
        if (id == ColorSpace.Named.BT709.ordinal()) {
            return C1020d.f11873g;
        }
        ColorSpace.Named unused7 = ColorSpace.Named.CIE_LAB;
        if (id == ColorSpace.Named.CIE_LAB.ordinal()) {
            return C1020d.f11884r;
        }
        ColorSpace.Named unused8 = ColorSpace.Named.CIE_XYZ;
        if (id == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return C1020d.f11883q;
        }
        ColorSpace.Named unused9 = ColorSpace.Named.DCI_P3;
        if (id == ColorSpace.Named.DCI_P3.ordinal()) {
            return C1020d.f11875i;
        }
        ColorSpace.Named unused10 = ColorSpace.Named.DISPLAY_P3;
        if (id == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return C1020d.f11876j;
        }
        ColorSpace.Named unused11 = ColorSpace.Named.EXTENDED_SRGB;
        if (id == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return C1020d.f11871e;
        }
        ColorSpace.Named unused12 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        if (id == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return C1020d.f11872f;
        }
        ColorSpace.Named unused13 = ColorSpace.Named.LINEAR_SRGB;
        if (id == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return C1020d.f11870d;
        }
        ColorSpace.Named unused14 = ColorSpace.Named.NTSC_1953;
        if (id == ColorSpace.Named.NTSC_1953.ordinal()) {
            return C1020d.f11877k;
        }
        ColorSpace.Named unused15 = ColorSpace.Named.PRO_PHOTO_RGB;
        if (id == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return C1020d.f11880n;
        }
        ColorSpace.Named unused16 = ColorSpace.Named.SMPTE_C;
        if (id == ColorSpace.Named.SMPTE_C.ordinal()) {
            return C1020d.f11878l;
        }
        if (!AbstractC1000w.j(colorSpace)) {
            return C1020d.f11869c;
        }
        ColorSpace.Rgb.TransferParameters transferParameters = AbstractC1000w.g(colorSpace).getTransferParameters();
        if (AbstractC1000w.g(colorSpace).getWhitePoint().length == 3) {
            float f5 = AbstractC1000w.g(colorSpace).getWhitePoint()[0];
            float f7 = AbstractC1000w.g(colorSpace).getWhitePoint()[1];
            float f8 = f5 + f7 + AbstractC1000w.g(colorSpace).getWhitePoint()[2];
            c1035s = new C1035s(f5 / f8, f7 / f8);
        } else {
            c1035s = new C1035s(AbstractC1000w.g(colorSpace).getWhitePoint()[0], AbstractC1000w.g(colorSpace).getWhitePoint()[1]);
        }
        C1035s c1035s2 = c1035s;
        C1034r c1034r = transferParameters != null ? new C1034r(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f) : null;
        String name = AbstractC1000w.g(colorSpace).getName();
        float[] primaries = AbstractC1000w.g(colorSpace).getPrimaries();
        float[] transform = AbstractC1000w.g(colorSpace).getTransform();
        final int i7 = 0;
        InterfaceC1025i interfaceC1025i = new InterfaceC1025i() { // from class: h0.z
            @Override // i0.InterfaceC1025i
            public final double d(double d4) {
                switch (i7) {
                    case 0:
                        return AbstractC1000w.g(colorSpace).getOetf().applyAsDouble(d4);
                    default:
                        return AbstractC1000w.g(colorSpace).getEotf().applyAsDouble(d4);
                }
            }
        };
        final int i8 = 1;
        return new C1033q(name, primaries, c1035s2, transform, interfaceC1025i, new InterfaceC1025i() { // from class: h0.z
            @Override // i0.InterfaceC1025i
            public final double d(double d4) {
                switch (i8) {
                    case 0:
                        return AbstractC1000w.g(colorSpace).getOetf().applyAsDouble(d4);
                    default:
                        return AbstractC1000w.g(colorSpace).getEotf().applyAsDouble(d4);
                }
            }
        }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0), c1034r, AbstractC1000w.g(colorSpace).getId());
    }
}
