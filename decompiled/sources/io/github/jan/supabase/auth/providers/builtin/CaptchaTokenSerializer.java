package io.github.jan.supabase.auth.providers.builtin;

import O3.C;
import P3.m;
import X5.g;
import X5.j;
import a6.o;
import a6.v;
import io.github.jan.supabase.annotations.SupabaseInternal;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.c;
import n6.d;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lio/github/jan/supabase/auth/providers/builtin/CaptchaTokenSerializer;", "Lkotlinx/serialization/KSerializer;", "", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SupabaseInternal
/* loaded from: classes.dex */
public final class CaptchaTokenSerializer implements KSerializer {
    public static final CaptchaTokenSerializer INSTANCE = new CaptchaTokenSerializer();
    private static final SerialDescriptor descriptor;

    static {
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
        if (AbstractC2510o.g0("CaptchaTokenSerializer")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        X5.a aVar = new X5.a("CaptchaTokenSerializer");
        descriptor$lambda$0(aVar);
        descriptor = new g("CaptchaTokenSerializer", j.f9951h, aVar.f9920c.size(), m.u0(serialDescriptorArr), aVar);
    }

    private CaptchaTokenSerializer() {
    }

    private static final C descriptor$lambda$0(X5.a aVar) {
        l.f("$this$buildClassSerialDescriptor", aVar);
        aVar.a("gotrue_meta_security", c.Companion.serializer().getDescriptor(), false);
        return C.a;
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public String deserialize(Decoder decoder) {
        l.f("decoder", decoder);
        throw new UnsupportedOperationException();
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, String value) {
        l.f("encoder", encoder);
        l.f("value", value);
        v vVar = new v();
        d.V("captcha_token", value, vVar);
        ((o) encoder).y(vVar.a());
    }
}
