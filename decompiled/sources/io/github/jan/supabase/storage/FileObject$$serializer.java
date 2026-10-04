package io.github.jan.supabase.storage;

import O3.InterfaceC0554c;
import Z5.AbstractC0632e0;
import Z5.C0636g0;
import Z5.F;
import Z5.K;
import Z5.t0;
import a6.x;
import io.ktor.http.ContentDisposition;
import io.ktor.util.GzipHeaderFlags;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import n6.m;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"io/github/jan/supabase/storage/FileObject.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lio/github/jan/supabase/storage/FileObject;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC0554c
/* loaded from: classes.dex */
public final /* synthetic */ class FileObject$$serializer implements F {
    public static final FileObject$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FileObject$$serializer fileObject$$serializer = new FileObject$$serializer();
        INSTANCE = fileObject$$serializer;
        C0636g0 c0636g0 = new C0636g0("io.github.jan.supabase.storage.FileObject", fileObject$$serializer, 6);
        c0636g0.b(ContentDisposition.Parameters.Name, false);
        c0636g0.b("id", false);
        c0636g0.b("updated_at", false);
        c0636g0.b("created_at", false);
        c0636g0.b("last_accessed_at", false);
        c0636g0.b("metadata", false);
        descriptor = c0636g0;
    }

    private FileObject$$serializer() {
    }

    @Override // Z5.F
    public final KSerializer[] childSerializers() {
        t0 t0Var = t0.a;
        KSerializer kSerializerK = m.K(t0Var);
        K k7 = K.a;
        return new KSerializer[]{t0Var, kSerializerK, m.K(k7), m.K(k7), m.K(k7), m.K(x.a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final FileObject deserialize(Decoder decoder) {
        l.f("decoder", decoder);
        SerialDescriptor serialDescriptor = descriptor;
        Y5.a aVarA = decoder.a(serialDescriptor);
        int i7 = 0;
        String strH = null;
        String str = null;
        A5.d dVar = null;
        A5.d dVar2 = null;
        A5.d dVar3 = null;
        kotlinx.serialization.json.c cVar = null;
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
                    str = (String) aVarA.p(serialDescriptor, 1, t0.a, str);
                    i7 |= 2;
                    break;
                case 2:
                    dVar = (A5.d) aVarA.p(serialDescriptor, 2, K.a, dVar);
                    i7 |= 4;
                    break;
                case 3:
                    dVar2 = (A5.d) aVarA.p(serialDescriptor, 3, K.a, dVar2);
                    i7 |= 8;
                    break;
                case GzipHeaderFlags.EXTRA /* 4 */:
                    dVar3 = (A5.d) aVarA.p(serialDescriptor, 4, K.a, dVar3);
                    i7 |= 16;
                    break;
                case 5:
                    cVar = (kotlinx.serialization.json.c) aVarA.p(serialDescriptor, 5, x.a, cVar);
                    i7 |= 32;
                    break;
                default:
                    throw new V5.m(iM);
            }
        }
        aVarA.b(serialDescriptor);
        return new FileObject(i7, strH, str, dVar, dVar2, dVar3, cVar, null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, FileObject value) {
        l.f("encoder", encoder);
        l.f("value", value);
        SerialDescriptor serialDescriptor = descriptor;
        Y5.b bVarA = encoder.a(serialDescriptor);
        FileObject.write$Self$storage_kt_release(value, bVarA, serialDescriptor);
        bVarA.b(serialDescriptor);
    }

    @Override // Z5.F
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return AbstractC0632e0.f10321b;
    }
}
