package I1;

import B1.InterfaceC0021h;
import B1.n;
import O1.InterfaceC0551z;
import O1.Y;
import V1.q;
import a2.C0661b;
import android.graphics.Bitmap;
import b2.C0706b;
import i0.InterfaceC1025i;
import io.github.jan.supabase.postgrest.PropertyConversionMethod;
import j3.AbstractC1331q;
import j3.G;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.concurrent.ExecutorService;
import l4.InterfaceC1442u;
import p.InterfaceC1774z;
import p2.p;
import s2.C1973a;
import s2.InterfaceC1980h;
import y1.E;
import y1.Q;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements n, i3.d, InterfaceC0021h, q, InterfaceC1025i, PropertyConversionMethod, InterfaceC1774z {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3952k;

    public /* synthetic */ e(int i7) {
        this.f3952k = i7;
    }

    public static Bitmap f(byte[] bArr, int i7) throws L1.d {
        try {
            return q0.c.z(bArr, i7);
        } catch (E e7) {
            throw new L1.d("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i7 + ")", e7);
        } catch (IOException e8) {
            throw new L1.d(e8);
        }
    }

    @Override // V1.q
    public V1.n[] a() {
        switch (this.f3952k) {
            case 15:
                return new V1.n[]{new W1.a()};
            case 16:
                return new V1.n[]{new C0661b()};
            case 17:
                return new V1.n[]{new C0706b()};
            default:
                return new V1.n[]{new p2.k(InterfaceC1980h.f15519h, 16)};
        }
    }

    @Override // i3.d
    public Object apply(Object obj) {
        switch (this.f3952k) {
            case 6:
                V1.n nVar = (V1.n) obj;
                nVar.getClass();
                return nVar.getClass().getSimpleName();
            case 7:
                return G.s(AbstractC1331q.r(((InterfaceC0551z) obj).j().f7449b, new e(9)));
            case 8:
            default:
                return (p) obj;
            case 9:
                return Integer.valueOf(((Q) obj).f17970c);
            case 10:
                return Long.valueOf(((C1973a) obj).f15508b);
            case 11:
                return Long.valueOf(((C1973a) obj).f15509c);
        }
    }

    @Override // p.InterfaceC1774z
    public float b(float f5) {
        return f5;
    }

    @Override // B1.InterfaceC0021h
    public void c(Object obj) {
        switch (this.f3952k) {
            case 8:
                ((Y) obj).f7376b.getClass();
                break;
            default:
                ((ExecutorService) obj).shutdown();
                break;
        }
    }

    @Override // i0.InterfaceC1025i
    public double d(double d4) {
        double d6;
        switch (this.f3952k) {
            case 19:
                double dPow = d4 < 0.0d ? -d4 : d4;
                if (dPow >= 0.0031308049535603718d) {
                    dPow = Math.pow(dPow, 0.4166666666666667d) - 0.05213270142180095d;
                    d6 = 0.9478672985781991d;
                } else {
                    d6 = 0.07739938080495357d;
                }
                return Math.copySign(dPow / d6, d4);
            case 20:
                double d7 = d4 < 0.0d ? -d4 : d4;
                return Math.copySign(d7 >= 0.04045d ? Math.pow((0.9478672985781991d * d7) + 0.05213270142180095d, 2.4d) : d7 * 0.07739938080495357d, d4);
            default:
                return d4;
        }
    }

    public Constructor g() {
        switch (this.f3952k) {
            case 13:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(V1.n.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(V1.n.class).getConstructor(new Class[0]);
        }
    }

    @Override // io.github.jan.supabase.postgrest.PropertyConversionMethod
    public String invoke(InterfaceC1442u interfaceC1442u) {
        switch (this.f3952k) {
            case 22:
                return PropertyConversionMethod.Companion.SERIAL_NAME$lambda$0(interfaceC1442u);
            case 23:
                return PropertyConversionMethod.Companion.CAMEL_CASE_TO_SNAKE_CASE$lambda$0(interfaceC1442u);
            default:
                return PropertyConversionMethod.Companion.NONE$lambda$0(interfaceC1442u);
        }
    }

    @Override // B1.n
    public void invoke(Object obj) {
        k kVar = (k) obj;
        switch (this.f3952k) {
            case 0:
                kVar.getClass();
                break;
            case 1:
                kVar.getClass();
                break;
            case 2:
                kVar.getClass();
                break;
            default:
                kVar.getClass();
                break;
        }
    }
}
