package io.github.jan.supabase.storage.resumable;

import A5.d;
import O3.InterfaceC0554c;
import V5.m;
import Y5.a;
import Y5.b;
import Z5.AbstractC0632e0;
import Z5.C0635g;
import Z5.C0636g0;
import Z5.F;
import Z5.K;
import Z5.o0;
import Z5.t0;
import io.ktor.util.GzipHeaderFlags;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"io/github/jan/supabase/storage/resumable/ResumableCacheEntry.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC0554c
/* loaded from: classes.dex */
public final /* synthetic */ class ResumableCacheEntry$$serializer implements F {
    public static final ResumableCacheEntry$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResumableCacheEntry$$serializer resumableCacheEntry$$serializer = new ResumableCacheEntry$$serializer();
        INSTANCE = resumableCacheEntry$$serializer;
        C0636g0 c0636g0 = new C0636g0("io.github.jan.supabase.storage.resumable.ResumableCacheEntry", resumableCacheEntry$$serializer, 6);
        c0636g0.b("url", false);
        c0636g0.b("path", false);
        c0636g0.b("bucketId", false);
        c0636g0.b("expiresAt", false);
        c0636g0.b("upsert", true);
        c0636g0.b("contentType", true);
        descriptor = c0636g0;
    }

    private ResumableCacheEntry$$serializer() {
    }

    @Override // Z5.F
    public final KSerializer[] childSerializers() {
        t0 t0Var = t0.a;
        return new KSerializer[]{t0Var, t0Var, t0Var, K.a, C0635g.a, t0Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResumableCacheEntry deserialize(Decoder decoder) {
        l.f("decoder", decoder);
        SerialDescriptor serialDescriptor = descriptor;
        a aVarA = decoder.a(serialDescriptor);
        int i7 = 0;
        boolean zE = false;
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        d dVar = null;
        String strH4 = null;
        boolean z7 = true;
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
                    strH3 = aVarA.h(serialDescriptor, 2);
                    i7 |= 4;
                    break;
                case 3:
                    dVar = (d) aVarA.s(serialDescriptor, 3, K.a, dVar);
                    i7 |= 8;
                    break;
                case GzipHeaderFlags.EXTRA /* 4 */:
                    zE = aVarA.e(serialDescriptor, 4);
                    i7 |= 16;
                    break;
                case 5:
                    strH4 = aVarA.h(serialDescriptor, 5);
                    i7 |= 32;
                    break;
                default:
                    throw new m(iM);
            }
        }
        aVarA.b(serialDescriptor);
        return new ResumableCacheEntry(i7, strH, strH2, strH3, dVar, zE, strH4, (o0) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResumableCacheEntry value) {
        l.f("encoder", encoder);
        l.f("value", value);
        SerialDescriptor serialDescriptor = descriptor;
        b bVarA = encoder.a(serialDescriptor);
        ResumableCacheEntry.write$Self$storage_kt_release(value, bVarA, serialDescriptor);
        bVarA.b(serialDescriptor);
    }

    @Override // Z5.F
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return AbstractC0632e0.f10321b;
    }
}
