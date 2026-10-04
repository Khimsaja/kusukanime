package io.ktor.http;

import O3.InterfaceC0554c;
import O3.i;
import Z5.AbstractC0632e0;
import Z5.C0635g;
import Z5.C0636g0;
import Z5.F;
import Z5.N;
import Z5.o0;
import Z5.t0;
import io.ktor.http.ContentDisposition;
import io.ktor.util.GzipHeaderFlags;
import io.ktor.util.date.GMTDate;
import io.ktor.util.date.GMTDate$$serializer;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import n6.m;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"io/ktor/http/Cookie.$serializer", "LZ5/F;", "Lio/ktor/http/Cookie;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LO3/C;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/ktor/http/Cookie;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/ktor/http/Cookie;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
@InterfaceC0554c
/* loaded from: classes.dex */
public /* synthetic */ class Cookie$$serializer implements F {
    public static final Cookie$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Cookie$$serializer cookie$$serializer = new Cookie$$serializer();
        INSTANCE = cookie$$serializer;
        C0636g0 c0636g0 = new C0636g0("io.ktor.http.Cookie", cookie$$serializer, 10);
        c0636g0.b(ContentDisposition.Parameters.Name, false);
        c0636g0.b("value", false);
        c0636g0.b("encoding", true);
        c0636g0.b("maxAge", true);
        c0636g0.b("expires", true);
        c0636g0.b("domain", true);
        c0636g0.b("path", true);
        c0636g0.b("secure", true);
        c0636g0.b("httpOnly", true);
        c0636g0.b("extensions", true);
        descriptor = c0636g0;
    }

    private Cookie$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z5.F
    public final KSerializer[] childSerializers() {
        i[] iVarArr = Cookie.$childSerializers;
        t0 t0Var = t0.a;
        C0635g c0635g = C0635g.a;
        return new KSerializer[]{t0Var, t0Var, iVarArr[2].getValue(), m.K(N.a), m.K(GMTDate$$serializer.INSTANCE), m.K(t0Var), m.K(t0Var), c0635g, c0635g, iVarArr[9].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Cookie deserialize(Decoder decoder) {
        l.f("decoder", decoder);
        SerialDescriptor serialDescriptor = descriptor;
        Y5.a aVarA = decoder.a(serialDescriptor);
        i[] iVarArr = Cookie.$childSerializers;
        Map map = null;
        String strH = null;
        String strH2 = null;
        CookieEncoding cookieEncoding = null;
        Integer num = null;
        GMTDate gMTDate = null;
        String str = null;
        String str2 = null;
        boolean z7 = true;
        int i7 = 0;
        boolean zE = false;
        boolean zE2 = false;
        while (z7) {
            int iM = aVarA.m(serialDescriptor);
            switch (iM) {
                case -1:
                    z7 = false;
                    break;
                case 0:
                    strH = aVarA.h(serialDescriptor, 0);
                    i7 |= 1;
                    break;
                case 1:
                    strH2 = aVarA.h(serialDescriptor, 1);
                    i7 |= 2;
                    break;
                case 2:
                    cookieEncoding = (CookieEncoding) aVarA.s(serialDescriptor, 2, (KSerializer) iVarArr[2].getValue(), cookieEncoding);
                    i7 |= 4;
                    break;
                case 3:
                    num = (Integer) aVarA.p(serialDescriptor, 3, N.a, num);
                    i7 |= 8;
                    break;
                case GzipHeaderFlags.EXTRA /* 4 */:
                    gMTDate = (GMTDate) aVarA.p(serialDescriptor, 4, GMTDate$$serializer.INSTANCE, gMTDate);
                    i7 |= 16;
                    break;
                case 5:
                    str = (String) aVarA.p(serialDescriptor, 5, t0.a, str);
                    i7 |= 32;
                    break;
                case 6:
                    str2 = (String) aVarA.p(serialDescriptor, 6, t0.a, str2);
                    i7 |= 64;
                    break;
                case 7:
                    zE = aVarA.e(serialDescriptor, 7);
                    i7 |= 128;
                    break;
                case 8:
                    zE2 = aVarA.e(serialDescriptor, 8);
                    i7 |= 256;
                    break;
                case 9:
                    map = (Map) aVarA.s(serialDescriptor, 9, (KSerializer) iVarArr[9].getValue(), map);
                    i7 |= 512;
                    break;
                default:
                    throw new V5.m(iM);
            }
        }
        aVarA.b(serialDescriptor);
        return new Cookie(i7, strH, strH2, cookieEncoding, num, gMTDate, str, str2, zE, zE2, map, (o0) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Cookie value) {
        l.f("encoder", encoder);
        l.f("value", value);
        SerialDescriptor serialDescriptor = descriptor;
        Y5.b bVarA = encoder.a(serialDescriptor);
        Cookie.write$Self$ktor_http(value, bVarA, serialDescriptor);
        bVarA.b(serialDescriptor);
    }

    @Override // Z5.F
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC0632e0.f10321b;
    }
}
