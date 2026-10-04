package io.github.jan.supabase.auth.user;

import A5.d;
import O3.InterfaceC0554c;
import Y5.a;
import Y5.b;
import Z5.AbstractC0632e0;
import Z5.C0636g0;
import Z5.F;
import Z5.K;
import Z5.T;
import Z5.o0;
import Z5.t0;
import io.ktor.http.LinkHeader;
import io.ktor.util.GzipHeaderFlags;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import n6.m;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"io/github/jan/supabase/auth/user/UserSession.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lio/github/jan/supabase/auth/user/UserSession;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC0554c
/* loaded from: classes.dex */
public final /* synthetic */ class UserSession$$serializer implements F {
    public static final UserSession$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        UserSession$$serializer userSession$$serializer = new UserSession$$serializer();
        INSTANCE = userSession$$serializer;
        C0636g0 c0636g0 = new C0636g0("io.github.jan.supabase.auth.user.UserSession", userSession$$serializer, 9);
        c0636g0.b("access_token", false);
        c0636g0.b("refresh_token", false);
        c0636g0.b("provider_refresh_token", true);
        c0636g0.b("provider_token", true);
        c0636g0.b("expires_in", false);
        c0636g0.b("token_type", false);
        c0636g0.b("user", true);
        c0636g0.b(LinkHeader.Parameters.Type, true);
        c0636g0.b("expiresAt", true);
        descriptor = c0636g0;
    }

    private UserSession$$serializer() {
    }

    @Override // Z5.F
    public final KSerializer[] childSerializers() {
        t0 t0Var = t0.a;
        return new KSerializer[]{t0Var, t0Var, m.K(t0Var), m.K(t0Var), T.a, t0Var, m.K(UserInfo$$serializer.INSTANCE), t0Var, K.a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final UserSession deserialize(Decoder decoder) {
        l.f("decoder", decoder);
        SerialDescriptor serialDescriptor = descriptor;
        a aVarA = decoder.a(serialDescriptor);
        UserInfo userInfo = null;
        String strH = null;
        String strH2 = null;
        String str = null;
        String str2 = null;
        String strH3 = null;
        String strH4 = null;
        long jN = 0;
        int i7 = 0;
        boolean z7 = true;
        d dVar = null;
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
                    str = (String) aVarA.p(serialDescriptor, 2, t0.a, str);
                    i7 |= 4;
                    break;
                case 3:
                    str2 = (String) aVarA.p(serialDescriptor, 3, t0.a, str2);
                    i7 |= 8;
                    break;
                case GzipHeaderFlags.EXTRA /* 4 */:
                    jN = aVarA.n(serialDescriptor, 4);
                    i7 |= 16;
                    break;
                case 5:
                    strH3 = aVarA.h(serialDescriptor, 5);
                    i7 |= 32;
                    break;
                case 6:
                    userInfo = (UserInfo) aVarA.p(serialDescriptor, 6, UserInfo$$serializer.INSTANCE, userInfo);
                    i7 |= 64;
                    break;
                case 7:
                    strH4 = aVarA.h(serialDescriptor, 7);
                    i7 |= 128;
                    break;
                case 8:
                    dVar = (d) aVarA.s(serialDescriptor, 8, K.a, dVar);
                    i7 |= 256;
                    break;
                default:
                    throw new V5.m(iM);
            }
        }
        aVarA.b(serialDescriptor);
        return new UserSession(i7, strH, strH2, str, str2, jN, strH3, userInfo, strH4, dVar, (o0) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, UserSession value) {
        l.f("encoder", encoder);
        l.f("value", value);
        SerialDescriptor serialDescriptor = descriptor;
        b bVarA = encoder.a(serialDescriptor);
        UserSession.write$Self$auth_kt_release(value, bVarA, serialDescriptor);
        bVarA.b(serialDescriptor);
    }

    @Override // Z5.F
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return AbstractC0632e0.f10321b;
    }
}
