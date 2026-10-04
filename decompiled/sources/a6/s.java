package a6;

import Z5.D0;
import Z5.k0;
import b1.AbstractC0703b;
import f.AbstractC0841b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import l4.AbstractC1420H;
import z5.AbstractC2516u;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public final class s implements KSerializer {
    public static final s a = new s();

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f10488b = AbstractC1420H.b("kotlinx.serialization.json.JsonLiteral");

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        kotlinx.serialization.json.b bVarR = n6.m.l(decoder).r();
        if (bVarR instanceof r) {
            return (r) bVarR;
        }
        StringBuilder sb = new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ");
        throw b6.v.c(-1, bVarR.toString(), AbstractC0703b.o(kotlin.jvm.internal.y.a, bVarR.getClass(), sb));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f10488b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        r rVar = (r) obj;
        kotlin.jvm.internal.l.f("encoder", encoder);
        kotlin.jvm.internal.l.f("value", rVar);
        n6.m.k(encoder);
        boolean z7 = rVar.f10485k;
        String str = rVar.f10487m;
        if (z7) {
            encoder.C(str);
            return;
        }
        SerialDescriptor serialDescriptor = rVar.f10486l;
        if (serialDescriptor != null) {
            encoder.p(serialDescriptor).C(str);
            return;
        }
        Long lV = AbstractC2517v.V(str);
        if (lV != null) {
            encoder.v(lV.longValue());
            return;
        }
        O3.x xVarS = AbstractC0841b.s(str);
        if (xVarS != null) {
            encoder.p(D0.f10286b).v(xVarS.f7548k);
            return;
        }
        Boolean bool = null;
        Double dValueOf = AbstractC2516u.G(str) ? Double.valueOf(Double.parseDouble(str)) : null;
        if (dValueOf != null) {
            encoder.g(dValueOf.doubleValue());
            return;
        }
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else if (str.equals("false")) {
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            encoder.l(bool.booleanValue());
        } else {
            encoder.C(str);
        }
    }
}
