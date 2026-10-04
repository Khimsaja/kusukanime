package com.kusukanime.data;

import O3.InterfaceC0554c;
import Z5.AbstractC0632e0;
import Z5.C0636g0;
import Z5.F;
import Z5.o0;
import Z5.t0;
import io.ktor.http.ContentDisposition;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import n6.m;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/kusukanime/data/UserMini.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kusukanime/data/UserMini;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC0554c
/* loaded from: classes.dex */
public final /* synthetic */ class UserMini$$serializer implements F {
    public static final int $stable;
    public static final UserMini$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        UserMini$$serializer userMini$$serializer = new UserMini$$serializer();
        INSTANCE = userMini$$serializer;
        $stable = 8;
        C0636g0 c0636g0 = new C0636g0("com.kusukanime.data.UserMini", userMini$$serializer, 2);
        c0636g0.b(ContentDisposition.Parameters.Name, true);
        c0636g0.b("avatar_url", true);
        descriptor = c0636g0;
    }

    private UserMini$$serializer() {
    }

    @Override // Z5.F
    public final KSerializer[] childSerializers() {
        t0 t0Var = t0.a;
        return new KSerializer[]{t0Var, m.K(t0Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final UserMini deserialize(Decoder decoder) {
        l.f("decoder", decoder);
        SerialDescriptor serialDescriptor = descriptor;
        Y5.a aVarA = decoder.a(serialDescriptor);
        boolean z7 = true;
        int i7 = 0;
        String strH = null;
        String str = null;
        while (z7) {
            int iM = aVarA.m(serialDescriptor);
            if (iM == -1) {
                z7 = false;
            } else if (iM == 0) {
                strH = aVarA.h(serialDescriptor, 0);
                i7 |= 1;
            } else {
                if (iM != 1) {
                    throw new V5.m(iM);
                }
                str = (String) aVarA.p(serialDescriptor, 1, t0.a, str);
                i7 |= 2;
            }
        }
        aVarA.b(serialDescriptor);
        return new UserMini(i7, strH, str, (o0) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, UserMini value) {
        l.f("encoder", encoder);
        l.f("value", value);
        SerialDescriptor serialDescriptor = descriptor;
        Y5.b bVarA = encoder.a(serialDescriptor);
        UserMini.write$Self$app_release(value, bVarA, serialDescriptor);
        bVarA.b(serialDescriptor);
    }

    @Override // Z5.F
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return AbstractC0632e0.f10321b;
    }
}
