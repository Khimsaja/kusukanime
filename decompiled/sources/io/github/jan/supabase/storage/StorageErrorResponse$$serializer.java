package io.github.jan.supabase.storage;

import O3.InterfaceC0554c;
import V5.m;
import Z5.AbstractC0632e0;
import Z5.C0636g0;
import Z5.F;
import Z5.N;
import Z5.t0;
import io.ktor.http.ContentType;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"io/github/jan/supabase/storage/StorageErrorResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lio/github/jan/supabase/storage/StorageErrorResponse;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC0554c
/* loaded from: classes.dex */
public final /* synthetic */ class StorageErrorResponse$$serializer implements F {
    public static final StorageErrorResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        StorageErrorResponse$$serializer storageErrorResponse$$serializer = new StorageErrorResponse$$serializer();
        INSTANCE = storageErrorResponse$$serializer;
        C0636g0 c0636g0 = new C0636g0("io.github.jan.supabase.storage.StorageErrorResponse", storageErrorResponse$$serializer, 3);
        c0636g0.b("statusCode", false);
        c0636g0.b("error", false);
        c0636g0.b(ContentType.Message.TYPE, false);
        descriptor = c0636g0;
    }

    private StorageErrorResponse$$serializer() {
    }

    @Override // Z5.F
    public final KSerializer[] childSerializers() {
        t0 t0Var = t0.a;
        return new KSerializer[]{N.a, t0Var, t0Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final StorageErrorResponse deserialize(Decoder decoder) {
        l.f("decoder", decoder);
        SerialDescriptor serialDescriptor = descriptor;
        Y5.a aVarA = decoder.a(serialDescriptor);
        int i7 = 0;
        int iU = 0;
        String strH = null;
        String strH2 = null;
        boolean z7 = true;
        while (z7) {
            int iM = aVarA.m(serialDescriptor);
            if (iM == -1) {
                z7 = false;
            } else if (iM == 0) {
                iU = aVarA.u(serialDescriptor, 0);
                i7 |= 1;
            } else if (iM == 1) {
                strH = aVarA.h(serialDescriptor, 1);
                i7 |= 2;
            } else {
                if (iM != 2) {
                    throw new m(iM);
                }
                strH2 = aVarA.h(serialDescriptor, 2);
                i7 |= 4;
            }
        }
        aVarA.b(serialDescriptor);
        return new StorageErrorResponse(i7, iU, strH, strH2, null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, StorageErrorResponse value) {
        l.f("encoder", encoder);
        l.f("value", value);
        SerialDescriptor serialDescriptor = descriptor;
        Y5.b bVarA = encoder.a(serialDescriptor);
        StorageErrorResponse.write$Self$storage_kt_release(value, bVarA, serialDescriptor);
        bVarA.b(serialDescriptor);
    }

    @Override // Z5.F
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return AbstractC0632e0.f10321b;
    }
}
