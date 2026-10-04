package G3;

import io.ktor.util.GzipHeaderFlags;
import java.math.BigDecimal;
import w6.C2224i;
import z5.C2496a;

/* loaded from: classes.dex */
public final class z extends j {
    public final /* synthetic */ int a;

    public /* synthetic */ z(int i7) {
        this.a = i7;
    }

    @Override // G3.j
    public final Object a(m mVar) throws NumberFormatException {
        long jLongValueExact;
        switch (this.a) {
            case 0:
                return mVar.H();
            case 1:
                n nVar = (n) mVar;
                int iY = nVar.f2817q;
                if (iY == 0) {
                    iY = nVar.Y();
                }
                boolean z7 = false;
                if (iY == 5) {
                    nVar.f2817q = 0;
                    int[] iArr = nVar.f2809n;
                    int i7 = nVar.f2806k - 1;
                    iArr[i7] = iArr[i7] + 1;
                    z7 = true;
                } else {
                    if (iY != 6) {
                        throw new D6.r("Expected a boolean but was " + A6.b.t(nVar.J()) + " at path " + nVar.j());
                    }
                    nVar.f2817q = 0;
                    int[] iArr2 = nVar.f2809n;
                    int i8 = nVar.f2806k - 1;
                    iArr2[i8] = iArr2[i8] + 1;
                }
                return Boolean.valueOf(z7);
            case 2:
                return Byte.valueOf((byte) C.f(mVar, "a byte", -128, 255));
            case 3:
                String strH = mVar.H();
                if (strH.length() <= 1) {
                    return Character.valueOf(strH.charAt(0));
                }
                throw new D6.r("Expected a char but was " + A6.b.d('\"', "\"", strH) + " at path " + mVar.j());
            case GzipHeaderFlags.EXTRA /* 4 */:
                return Double.valueOf(mVar.s());
            case 5:
                float fS = (float) mVar.s();
                if (!Float.isInfinite(fS)) {
                    return Float.valueOf(fS);
                }
                throw new D6.r("JSON forbids NaN and infinities: " + fS + " at path " + mVar.j());
            case 6:
                return Integer.valueOf(mVar.v());
            case 7:
                n nVar2 = (n) mVar;
                int iY2 = nVar2.f2817q;
                if (iY2 == 0) {
                    iY2 = nVar2.Y();
                }
                if (iY2 == 16) {
                    nVar2.f2817q = 0;
                    int[] iArr3 = nVar2.f2809n;
                    int i9 = nVar2.f2806k - 1;
                    iArr3[i9] = iArr3[i9] + 1;
                    jLongValueExact = nVar2.f2818r;
                } else {
                    if (iY2 == 17) {
                        long j7 = nVar2.f2819s;
                        C2224i c2224i = nVar2.f2816p;
                        c2224i.getClass();
                        nVar2.f2820t = c2224i.Z(j7, C2496a.f19036b);
                    } else if (iY2 == 9 || iY2 == 8) {
                        String strE0 = iY2 == 9 ? nVar2.e0(n.f2811v) : nVar2.e0(n.f2810u);
                        nVar2.f2820t = strE0;
                        try {
                            jLongValueExact = Long.parseLong(strE0);
                            nVar2.f2817q = 0;
                            int[] iArr4 = nVar2.f2809n;
                            int i10 = nVar2.f2806k - 1;
                            iArr4[i10] = iArr4[i10] + 1;
                        } catch (NumberFormatException unused) {
                        }
                    } else if (iY2 != 11) {
                        throw new D6.r("Expected a long but was " + A6.b.t(nVar2.J()) + " at path " + nVar2.j());
                    }
                    nVar2.f2817q = 11;
                    try {
                        jLongValueExact = new BigDecimal(nVar2.f2820t).longValueExact();
                        nVar2.f2820t = null;
                        nVar2.f2817q = 0;
                        int[] iArr5 = nVar2.f2809n;
                        int i11 = nVar2.f2806k - 1;
                        iArr5[i11] = iArr5[i11] + 1;
                    } catch (ArithmeticException | NumberFormatException unused2) {
                        throw new D6.r("Expected a long but was " + nVar2.f2820t + " at path " + nVar2.j());
                    }
                }
                return Long.valueOf(jLongValueExact);
            default:
                return Short.valueOf((short) C.f(mVar, "a short", -32768, 32767));
        }
    }

    @Override // G3.j
    public final void c(p pVar, Object obj) {
        switch (this.a) {
            case 0:
                pVar.v((String) obj);
                return;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                o oVar = (o) pVar;
                if (oVar.f2828o) {
                    throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + oVar.g());
                }
                oVar.O();
                oVar.x();
                oVar.f2822q.k0(zBooleanValue ? "true" : "false");
                int[] iArr = oVar.f2827n;
                int i7 = oVar.f2824k - 1;
                iArr[i7] = iArr[i7] + 1;
                return;
            case 2:
                pVar.s(((Byte) obj).intValue() & 255);
                return;
            case 3:
                pVar.v(((Character) obj).toString());
                return;
            case GzipHeaderFlags.EXTRA /* 4 */:
                double dDoubleValue = ((Double) obj).doubleValue();
                o oVar2 = (o) pVar;
                oVar2.getClass();
                if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was " + dDoubleValue);
                }
                if (oVar2.f2828o) {
                    oVar2.f2828o = false;
                    oVar2.i(Double.toString(dDoubleValue));
                    return;
                }
                oVar2.O();
                oVar2.x();
                oVar2.f2822q.k0(Double.toString(dDoubleValue));
                int[] iArr2 = oVar2.f2827n;
                int i8 = oVar2.f2824k - 1;
                iArr2[i8] = iArr2[i8] + 1;
                return;
            case 5:
                Float f5 = (Float) obj;
                f5.getClass();
                o oVar3 = (o) pVar;
                oVar3.getClass();
                String string = f5.toString();
                if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was " + f5);
                }
                if (oVar3.f2828o) {
                    oVar3.f2828o = false;
                    oVar3.i(string);
                    return;
                }
                oVar3.O();
                oVar3.x();
                oVar3.f2822q.k0(string);
                int[] iArr3 = oVar3.f2827n;
                int i9 = oVar3.f2824k - 1;
                iArr3[i9] = iArr3[i9] + 1;
                return;
            case 6:
                pVar.s(((Integer) obj).intValue());
                return;
            case 7:
                pVar.s(((Long) obj).longValue());
                return;
            default:
                pVar.s(((Short) obj).intValue());
                return;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "JsonAdapter(String)";
            case 1:
                return "JsonAdapter(Boolean)";
            case 2:
                return "JsonAdapter(Byte)";
            case 3:
                return "JsonAdapter(Character)";
            case GzipHeaderFlags.EXTRA /* 4 */:
                return "JsonAdapter(Double)";
            case 5:
                return "JsonAdapter(Float)";
            case 6:
                return "JsonAdapter(Integer)";
            case 7:
                return "JsonAdapter(Long)";
            default:
                return "JsonAdapter(Short)";
        }
    }
}
