package io.github.jan.supabase.auth.user;

import A5.d;
import O3.InterfaceC0554c;
import O3.i;
import Y5.a;
import Y5.b;
import Z5.AbstractC0632e0;
import Z5.C0636g0;
import Z5.F;
import Z5.K;
import Z5.o0;
import Z5.t0;
import a6.x;
import io.ktor.util.GzipHeaderFlags;
import io.ktor.utils.io.ByteChannelKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.c;
import n6.m;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"io/github/jan/supabase/auth/user/UserInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lio/github/jan/supabase/auth/user/UserInfo;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC0554c
/* loaded from: classes.dex */
public final /* synthetic */ class UserInfo$$serializer implements F {
    public static final UserInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        UserInfo$$serializer userInfo$$serializer = new UserInfo$$serializer();
        INSTANCE = userInfo$$serializer;
        C0636g0 c0636g0 = new C0636g0("io.github.jan.supabase.auth.user.UserInfo", userInfo$$serializer, 23);
        c0636g0.b("app_metadata", true);
        c0636g0.b("aud", false);
        c0636g0.b("confirmation_sent_at", true);
        c0636g0.b("confirmed_at", true);
        c0636g0.b("created_at", true);
        c0636g0.b("email", true);
        c0636g0.b("email_confirmed_at", true);
        c0636g0.b("factors", true);
        c0636g0.b("id", false);
        c0636g0.b("identities", true);
        c0636g0.b("last_sign_in_at", true);
        c0636g0.b("phone", true);
        c0636g0.b("role", true);
        c0636g0.b("updated_at", true);
        c0636g0.b("user_metadata", true);
        c0636g0.b("phone_change_sent_at", true);
        c0636g0.b("new_phone", true);
        c0636g0.b("email_change_sent_at", true);
        c0636g0.b("new_email", true);
        c0636g0.b("invited_at", true);
        c0636g0.b("recovery_sent_at", true);
        c0636g0.b("phone_confirmed_at", true);
        c0636g0.b("action_link", true);
        descriptor = c0636g0;
    }

    private UserInfo$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z5.F
    public final KSerializer[] childSerializers() {
        i[] iVarArr = UserInfo.$childSerializers;
        x xVar = x.a;
        t0 t0Var = t0.a;
        K k7 = K.a;
        return new KSerializer[]{m.K(xVar), t0Var, m.K(k7), m.K(k7), m.K(k7), m.K(t0Var), m.K(k7), iVarArr[7].getValue(), t0Var, m.K((KSerializer) iVarArr[9].getValue()), m.K(k7), m.K(t0Var), m.K(t0Var), m.K(k7), m.K(xVar), m.K(k7), m.K(t0Var), m.K(k7), m.K(t0Var), m.K(k7), m.K(k7), m.K(k7), m.K(t0Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final UserInfo deserialize(Decoder decoder) {
        String str;
        int i7;
        c cVar;
        String str2;
        l.f("decoder", decoder);
        SerialDescriptor serialDescriptor = descriptor;
        a aVarA = decoder.a(serialDescriptor);
        i[] iVarArr = UserInfo.$childSerializers;
        c cVar2 = null;
        d dVar = null;
        String str3 = null;
        d dVar2 = null;
        String str4 = null;
        String str5 = null;
        d dVar3 = null;
        d dVar4 = null;
        String str6 = null;
        d dVar5 = null;
        d dVar6 = null;
        d dVar7 = null;
        String str7 = null;
        String strH = null;
        String strH2 = null;
        c cVar3 = null;
        d dVar8 = null;
        d dVar9 = null;
        d dVar10 = null;
        String str8 = null;
        d dVar11 = null;
        List list = null;
        List list2 = null;
        int i8 = 0;
        boolean z7 = true;
        while (z7) {
            d dVar12 = dVar2;
            int iM = aVarA.m(serialDescriptor);
            switch (iM) {
                case -1:
                    String str9 = str8;
                    String str10 = str5;
                    cVar = cVar2;
                    str2 = str4;
                    cVar3 = cVar3;
                    str5 = str10;
                    str8 = str9;
                    dVar6 = dVar6;
                    list2 = list2;
                    z7 = false;
                    dVar2 = dVar12;
                    str4 = str2;
                    cVar2 = cVar;
                case 0:
                    str = str4;
                    String str11 = str8;
                    String str12 = str5;
                    c cVar4 = (c) aVarA.p(serialDescriptor, 0, x.a, cVar3);
                    i8 |= 1;
                    str5 = str12;
                    dVar2 = dVar12;
                    cVar2 = cVar2;
                    str8 = str11;
                    dVar6 = dVar6;
                    list2 = list2;
                    cVar3 = cVar4;
                    str4 = str;
                case 1:
                    cVar = cVar2;
                    strH2 = aVarA.h(serialDescriptor, 1);
                    i8 |= 2;
                    dVar2 = dVar12;
                    cVar2 = cVar;
                case 2:
                    cVar = cVar2;
                    str2 = str4;
                    dVar8 = (d) aVarA.p(serialDescriptor, 2, K.a, dVar8);
                    i8 |= 4;
                    dVar2 = dVar12;
                    str4 = str2;
                    cVar2 = cVar;
                case 3:
                    cVar = cVar2;
                    str2 = str4;
                    dVar9 = (d) aVarA.p(serialDescriptor, 3, K.a, dVar9);
                    i8 |= 8;
                    dVar2 = dVar12;
                    str4 = str2;
                    cVar2 = cVar;
                case GzipHeaderFlags.EXTRA /* 4 */:
                    cVar = cVar2;
                    str2 = str4;
                    dVar10 = (d) aVarA.p(serialDescriptor, 4, K.a, dVar10);
                    i8 |= 16;
                    dVar2 = dVar12;
                    str4 = str2;
                    cVar2 = cVar;
                case 5:
                    cVar = cVar2;
                    str2 = str4;
                    str8 = (String) aVarA.p(serialDescriptor, 5, t0.a, str8);
                    i8 |= 32;
                    dVar2 = dVar12;
                    str4 = str2;
                    cVar2 = cVar;
                case 6:
                    cVar = cVar2;
                    str2 = str4;
                    dVar11 = (d) aVarA.p(serialDescriptor, 6, K.a, dVar11);
                    i8 |= 64;
                    dVar2 = dVar12;
                    str4 = str2;
                    cVar2 = cVar;
                case 7:
                    cVar = cVar2;
                    str2 = str4;
                    list = (List) aVarA.s(serialDescriptor, 7, (KSerializer) iVarArr[7].getValue(), list);
                    i8 |= 128;
                    dVar2 = dVar12;
                    str4 = str2;
                    cVar2 = cVar;
                case 8:
                    cVar = cVar2;
                    strH = aVarA.h(serialDescriptor, 8);
                    i8 |= 256;
                    dVar2 = dVar12;
                    cVar2 = cVar;
                case 9:
                    cVar = cVar2;
                    str2 = str4;
                    list2 = (List) aVarA.p(serialDescriptor, 9, (KSerializer) iVarArr[9].getValue(), list2);
                    i8 |= 512;
                    dVar2 = dVar12;
                    str4 = str2;
                    cVar2 = cVar;
                case 10:
                    cVar = cVar2;
                    str2 = str4;
                    dVar2 = (d) aVarA.p(serialDescriptor, 10, K.a, dVar12);
                    i8 |= 1024;
                    str4 = str2;
                    cVar2 = cVar;
                case 11:
                    cVar = cVar2;
                    str4 = (String) aVarA.p(serialDescriptor, 11, t0.a, str4);
                    i8 |= 2048;
                    dVar2 = dVar12;
                    cVar2 = cVar;
                case 12:
                    str = str4;
                    str3 = (String) aVarA.p(serialDescriptor, 12, t0.a, str3);
                    i8 |= 4096;
                    dVar2 = dVar12;
                    str4 = str;
                case 13:
                    str = str4;
                    dVar = (d) aVarA.p(serialDescriptor, 13, K.a, dVar);
                    i8 |= 8192;
                    dVar2 = dVar12;
                    str4 = str;
                case 14:
                    str = str4;
                    cVar2 = (c) aVarA.p(serialDescriptor, 14, x.a, cVar2);
                    i8 |= 16384;
                    dVar2 = dVar12;
                    str4 = str;
                case 15:
                    str = str4;
                    dVar3 = (d) aVarA.p(serialDescriptor, 15, K.a, dVar3);
                    i7 = 32768;
                    i8 |= i7;
                    dVar2 = dVar12;
                    str4 = str;
                case 16:
                    str = str4;
                    str5 = (String) aVarA.p(serialDescriptor, 16, t0.a, str5);
                    i7 = 65536;
                    i8 |= i7;
                    dVar2 = dVar12;
                    str4 = str;
                case 17:
                    str = str4;
                    dVar4 = (d) aVarA.p(serialDescriptor, 17, K.a, dVar4);
                    i7 = 131072;
                    i8 |= i7;
                    dVar2 = dVar12;
                    str4 = str;
                case 18:
                    str = str4;
                    str6 = (String) aVarA.p(serialDescriptor, 18, t0.a, str6);
                    i7 = 262144;
                    i8 |= i7;
                    dVar2 = dVar12;
                    str4 = str;
                case 19:
                    str = str4;
                    dVar5 = (d) aVarA.p(serialDescriptor, 19, K.a, dVar5);
                    i7 = 524288;
                    i8 |= i7;
                    dVar2 = dVar12;
                    str4 = str;
                case 20:
                    str = str4;
                    dVar6 = (d) aVarA.p(serialDescriptor, 20, K.a, dVar6);
                    i7 = ByteChannelKt.CHANNEL_MAX_SIZE;
                    i8 |= i7;
                    dVar2 = dVar12;
                    str4 = str;
                case 21:
                    str = str4;
                    dVar7 = (d) aVarA.p(serialDescriptor, 21, K.a, dVar7);
                    i7 = 2097152;
                    i8 |= i7;
                    dVar2 = dVar12;
                    str4 = str;
                case 22:
                    str = str4;
                    str7 = (String) aVarA.p(serialDescriptor, 22, t0.a, str7);
                    i7 = 4194304;
                    i8 |= i7;
                    dVar2 = dVar12;
                    str4 = str;
                default:
                    throw new V5.m(iM);
            }
        }
        String str13 = str8;
        String str14 = str5;
        c cVar5 = cVar2;
        d dVar13 = dVar2;
        String str15 = str4;
        d dVar14 = dVar8;
        aVarA.b(serialDescriptor);
        d dVar15 = dVar5;
        String str16 = str7;
        return new UserInfo(i8, cVar3, strH2, dVar14, dVar9, dVar10, str13, dVar11, list, strH, list2, dVar13, str15, str3, dVar, cVar5, dVar3, str14, dVar4, str6, dVar15, dVar6, dVar7, str16, (o0) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, UserInfo value) {
        l.f("encoder", encoder);
        l.f("value", value);
        SerialDescriptor serialDescriptor = descriptor;
        b bVarA = encoder.a(serialDescriptor);
        UserInfo.write$Self$auth_kt_release(value, bVarA, serialDescriptor);
        bVarA.b(serialDescriptor);
    }

    @Override // Z5.F
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return AbstractC0632e0.f10321b;
    }
}
