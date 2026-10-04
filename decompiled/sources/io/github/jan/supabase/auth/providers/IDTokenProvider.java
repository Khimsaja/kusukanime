package io.github.jan.supabase.auth.providers;

import V5.i;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import l4.AbstractC1420H;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lio/github/jan/supabase/auth/providers/IDTokenProvider;", "Lio/github/jan/supabase/auth/providers/OAuthProvider;", "<init>", "()V", "Companion", "Lio/github/jan/supabase/auth/providers/Apple;", "Lio/github/jan/supabase/auth/providers/Azure;", "Lio/github/jan/supabase/auth/providers/Facebook;", "Lio/github/jan/supabase/auth/providers/Google;", "Lio/github/jan/supabase/auth/providers/Kakao;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i(with = Companion.class)
/* loaded from: classes.dex */
public abstract class IDTokenProvider extends OAuthProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final SerialDescriptor descriptor = AbstractC1420H.b("IDTokenProvider");

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lio/github/jan/supabase/auth/providers/IDTokenProvider$Companion;", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/providers/IDTokenProvider;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "serializer", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements KSerializer {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        @Override // kotlinx.serialization.KSerializer
        public SerialDescriptor getDescriptor() {
            return IDTokenProvider.descriptor;
        }

        public final KSerializer serializer() {
            return IDTokenProvider.INSTANCE;
        }

        private Companion() {
        }

        @Override // kotlinx.serialization.KSerializer
        public IDTokenProvider deserialize(Decoder decoder) {
            l.f("decoder", decoder);
            throw new UnsupportedOperationException();
        }

        @Override // kotlinx.serialization.KSerializer
        public void serialize(Encoder encoder, IDTokenProvider value) {
            l.f("encoder", encoder);
            l.f("value", value);
            encoder.C(value.getName());
        }
    }

    public /* synthetic */ IDTokenProvider(f fVar) {
        this();
    }

    private IDTokenProvider() {
    }
}
