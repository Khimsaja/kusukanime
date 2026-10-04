package io.github.jan.supabase.auth.providers.builtin;

import O3.InterfaceC0554c;
import Y5.b;
import Z5.AbstractC0632e0;
import Z5.C0636g0;
import Z5.F;
import Z5.t0;
import a6.x;
import io.github.jan.supabase.auth.providers.IDTokenProvider;
import io.github.jan.supabase.auth.providers.builtin.IDToken;
import io.ktor.util.GzipHeaderFlags;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.c;
import n6.m;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"io/github/jan/supabase/auth/providers/builtin/IDToken.Config.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lio/github/jan/supabase/auth/providers/builtin/IDToken$Config;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC0554c
/* loaded from: classes.dex */
public final /* synthetic */ class IDToken$Config$$serializer implements F {
    public static final IDToken$Config$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        IDToken$Config$$serializer iDToken$Config$$serializer = new IDToken$Config$$serializer();
        INSTANCE = iDToken$Config$$serializer;
        C0636g0 c0636g0 = new C0636g0("io.github.jan.supabase.auth.providers.builtin.IDToken.Config", iDToken$Config$$serializer, 6);
        c0636g0.b("gotrue_meta_security", true);
        c0636g0.b("data", true);
        c0636g0.b("id_token", true);
        c0636g0.b("provider", true);
        c0636g0.b("access_token", true);
        c0636g0.b("nonce", true);
        descriptor = c0636g0;
    }

    private IDToken$Config$$serializer() {
    }

    @Override // Z5.F
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerK = m.K(CaptchaTokenSerializer.INSTANCE);
        KSerializer kSerializerK2 = m.K(x.a);
        t0 t0Var = t0.a;
        return new KSerializer[]{kSerializerK, kSerializerK2, t0Var, m.K(IDTokenProvider.INSTANCE), m.K(t0Var), m.K(t0Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final IDToken.Config deserialize(Decoder decoder) {
        l.f("decoder", decoder);
        SerialDescriptor serialDescriptor = descriptor;
        Y5.a aVarA = decoder.a(serialDescriptor);
        int i7 = 0;
        String str = null;
        c cVar = null;
        String strH = null;
        IDTokenProvider iDTokenProvider = null;
        String str2 = null;
        String str3 = null;
        boolean z7 = true;
        while (z7) {
            int iM = aVarA.m(serialDescriptor);
            switch (iM) {
                case -1:
                    z7 = false;
                    break;
                case 0:
                    str = (String) aVarA.p(serialDescriptor, 0, CaptchaTokenSerializer.INSTANCE, str);
                    i7 |= 1;
                    break;
                case 1:
                    cVar = (c) aVarA.p(serialDescriptor, 1, x.a, cVar);
                    i7 |= 2;
                    break;
                case 2:
                    strH = aVarA.h(serialDescriptor, 2);
                    i7 |= 4;
                    break;
                case 3:
                    iDTokenProvider = (IDTokenProvider) aVarA.p(serialDescriptor, 3, IDTokenProvider.INSTANCE, iDTokenProvider);
                    i7 |= 8;
                    break;
                case GzipHeaderFlags.EXTRA /* 4 */:
                    str2 = (String) aVarA.p(serialDescriptor, 4, t0.a, str2);
                    i7 |= 16;
                    break;
                case 5:
                    str3 = (String) aVarA.p(serialDescriptor, 5, t0.a, str3);
                    i7 |= 32;
                    break;
                default:
                    throw new V5.m(iM);
            }
        }
        aVarA.b(serialDescriptor);
        return new IDToken.Config(i7, str, cVar, strH, iDTokenProvider, str2, str3, null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, IDToken.Config value) {
        l.f("encoder", encoder);
        l.f("value", value);
        SerialDescriptor serialDescriptor = descriptor;
        b bVarA = encoder.a(serialDescriptor);
        IDToken.Config.write$Self$auth_kt_release(value, bVarA, serialDescriptor);
        bVarA.b(serialDescriptor);
    }

    @Override // Z5.F
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return AbstractC0632e0.f10321b;
    }
}
