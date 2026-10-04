package b6;

import e6.AbstractC0838b;
import e6.C0837a;
import f1.AbstractC0871d;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: b6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0727b extends AbstractC0871d {
    public final /* synthetic */ int a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f11014b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11015c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f11016d;

    public C0727b(y yVar, String str) {
        this.f11014b = yVar;
        this.f11015c = str;
        this.f11016d = yVar.f11041b.f10460b;
    }

    @Override // f1.AbstractC0871d, kotlinx.serialization.encoding.Encoder
    public void C(String str) {
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.l.f("value", str);
                this.f11014b.N(this.f11015c, new a6.r(str, false, (SerialDescriptor) this.f11016d));
                break;
            default:
                super.C(str);
                break;
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final AbstractC0838b c() {
        switch (this.a) {
            case 0:
                return this.f11014b.f11041b.f10460b;
            default:
                return (C0837a) this.f11016d;
        }
    }

    @Override // f1.AbstractC0871d, kotlinx.serialization.encoding.Encoder
    public void h(short s7) {
        switch (this.a) {
            case 1:
                w0(String.valueOf(s7 & 65535));
                break;
            default:
                super.h(s7);
                break;
        }
    }

    @Override // f1.AbstractC0871d, kotlinx.serialization.encoding.Encoder
    public void k(byte b4) {
        switch (this.a) {
            case 1:
                w0(String.valueOf(b4 & 255));
                break;
            default:
                super.k(b4);
                break;
        }
    }

    @Override // f1.AbstractC0871d, kotlinx.serialization.encoding.Encoder
    public void o(int i7) {
        switch (this.a) {
            case 1:
                w0(Long.toString(i7 & 4294967295L, 10));
                break;
            default:
                super.o(i7);
                break;
        }
    }

    @Override // f1.AbstractC0871d, kotlinx.serialization.encoding.Encoder
    public void v(long j7) {
        String str;
        switch (this.a) {
            case 1:
                if (j7 == 0) {
                    str = "0";
                } else if (j7 > 0) {
                    str = Long.toString(j7, 10);
                } else {
                    char[] cArr = new char[64];
                    long j8 = (j7 >>> 1) / 5;
                    long j9 = 10;
                    int i7 = 63;
                    cArr[63] = Character.forDigit((int) (j7 - (j8 * j9)), 10);
                    while (j8 > 0) {
                        i7--;
                        cArr[i7] = Character.forDigit((int) (j8 % j9), 10);
                        j8 /= j9;
                    }
                    str = new String(cArr, i7, 64 - i7);
                }
                w0(str);
                break;
            default:
                super.v(j7);
                break;
        }
    }

    public void w0(String str) {
        kotlin.jvm.internal.l.f("s", str);
        this.f11014b.N(this.f11015c, new a6.r(str, false, null));
    }

    public C0727b(y yVar, String str, SerialDescriptor serialDescriptor) {
        this.f11014b = yVar;
        this.f11015c = str;
        this.f11016d = serialDescriptor;
    }
}
