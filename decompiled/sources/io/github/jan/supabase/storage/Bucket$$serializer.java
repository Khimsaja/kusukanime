package io.github.jan.supabase.storage;

import O3.InterfaceC0554c;
import O3.i;
import Z5.AbstractC0632e0;
import Z5.C0635g;
import Z5.C0636g0;
import Z5.F;
import Z5.K;
import Z5.T;
import Z5.o0;
import Z5.t0;
import io.ktor.client.utils.CacheControl;
import io.ktor.http.ContentDisposition;
import io.ktor.util.GzipHeaderFlags;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import n6.m;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"io/github/jan/supabase/storage/Bucket.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lio/github/jan/supabase/storage/Bucket;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC0554c
/* loaded from: classes.dex */
public final /* synthetic */ class Bucket$$serializer implements F {
    public static final Bucket$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Bucket$$serializer bucket$$serializer = new Bucket$$serializer();
        INSTANCE = bucket$$serializer;
        C0636g0 c0636g0 = new C0636g0("io.github.jan.supabase.storage.Bucket", bucket$$serializer, 8);
        c0636g0.b("created_at", false);
        c0636g0.b("id", false);
        c0636g0.b(ContentDisposition.Parameters.Name, false);
        c0636g0.b("owner", false);
        c0636g0.b("updated_at", false);
        c0636g0.b(CacheControl.PUBLIC, false);
        c0636g0.b("allowed_mime_types", true);
        c0636g0.b("file_size_limit", true);
        descriptor = c0636g0;
    }

    private Bucket$$serializer() {
    }

    @Override // Z5.F
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerK = m.K((KSerializer) Bucket.$childSerializers[6].getValue());
        KSerializer kSerializerK2 = m.K(T.a);
        K k7 = K.a;
        t0 t0Var = t0.a;
        return new KSerializer[]{k7, t0Var, t0Var, t0Var, k7, C0635g.a, kSerializerK, kSerializerK2};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Bucket deserialize(Decoder decoder) {
        l.f("decoder", decoder);
        SerialDescriptor serialDescriptor = descriptor;
        Y5.a aVarA = decoder.a(serialDescriptor);
        i[] iVarArr = Bucket.$childSerializers;
        A5.d dVar = null;
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        A5.d dVar2 = null;
        List list = null;
        Long l7 = null;
        int i7 = 0;
        boolean zE = false;
        boolean z7 = true;
        while (z7) {
            int iM = aVarA.m(serialDescriptor);
            switch (iM) {
                case -1:
                    z7 = false;
                    break;
                case 0:
                    dVar = (A5.d) aVarA.s(serialDescriptor, 0, K.a, dVar);
                    i7 |= 1;
                    break;
                case 1:
                    strH = aVarA.h(serialDescriptor, 1);
                    i7 |= 2;
                    break;
                case 2:
                    strH2 = aVarA.h(serialDescriptor, 2);
                    i7 |= 4;
                    break;
                case 3:
                    strH3 = aVarA.h(serialDescriptor, 3);
                    i7 |= 8;
                    break;
                case GzipHeaderFlags.EXTRA /* 4 */:
                    dVar2 = (A5.d) aVarA.s(serialDescriptor, 4, K.a, dVar2);
                    i7 |= 16;
                    break;
                case 5:
                    zE = aVarA.e(serialDescriptor, 5);
                    i7 |= 32;
                    break;
                case 6:
                    list = (List) aVarA.p(serialDescriptor, 6, (KSerializer) iVarArr[6].getValue(), list);
                    i7 |= 64;
                    break;
                case 7:
                    l7 = (Long) aVarA.p(serialDescriptor, 7, T.a, l7);
                    i7 |= 128;
                    break;
                default:
                    throw new V5.m(iM);
            }
        }
        aVarA.b(serialDescriptor);
        return new Bucket(i7, dVar, strH, strH2, strH3, dVar2, zE, list, l7, (o0) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Bucket value) {
        l.f("encoder", encoder);
        l.f("value", value);
        SerialDescriptor serialDescriptor = descriptor;
        Y5.b bVarA = encoder.a(serialDescriptor);
        Bucket.write$Self$storage_kt_release(value, bVarA, serialDescriptor);
        bVarA.b(serialDescriptor);
    }

    @Override // Z5.F
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return AbstractC0632e0.f10321b;
    }
}
