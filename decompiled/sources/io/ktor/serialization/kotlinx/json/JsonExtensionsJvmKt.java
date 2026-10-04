package io.ktor.serialization.kotlinx.json;

import H5.A;
import H5.D;
import H5.M;
import O3.C;
import P3.r;
import S3.c;
import T3.a;
import U3.e;
import U3.j;
import X4.y;
import a6.EnumC0672b;
import a6.d;
import b6.G;
import b6.t;
import b6.u;
import b6.v;
import b6.z;
import e4.n;
import io.ktor.serialization.kotlinx.SerializerLookupKt;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.jvm.javaio.BlockingKt;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import y5.C2418a;
import y5.h;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a2\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0080@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"La6/d;", "format", "Lio/ktor/utils/io/ByteReadChannel;", "content", "Lio/ktor/util/reflect/TypeInfo;", "typeInfo", "Ly5/h;", "", "deserializeSequence", "(La6/d;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/util/reflect/TypeInfo;LS3/c;)Ljava/lang/Object;", "ktor-serialization-kotlinx-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JsonExtensionsJvmKt {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH5/A;", "Ly5/h;", "", "<anonymous>", "(LH5/A;)Ly5/h;"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.serialization.kotlinx.json.JsonExtensionsJvmKt$deserializeSequence$2", f = "JsonExtensionsJvm.kt", l = {}, m = "invokeSuspend")
    /* renamed from: io.ktor.serialization.kotlinx.json.JsonExtensionsJvmKt$deserializeSequence$2, reason: invalid class name */
    public static final class AnonymousClass2 extends j implements n {
        final /* synthetic */ ByteReadChannel $content;
        final /* synthetic */ d $format;
        final /* synthetic */ TypeInfo $typeInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ByteReadChannel byteReadChannel, TypeInfo typeInfo, d dVar, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$content = byteReadChannel;
            this.$typeInfo = typeInfo;
            this.$format = dVar;
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            return new AnonymousClass2(this.$content, this.$typeInfo, this.$format, cVar);
        }

        @Override // e4.n
        public final Object invoke(A a, c<? super h> cVar) {
            return ((AnonymousClass2) create(a, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC0672b enumC0672b;
            Object uVar;
            a aVar = a.f9048k;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
            InputStream inputStream$default = BlockingKt.toInputStream$default(this.$content, null, 1, null);
            KSerializer kSerializerSerializerForTypeInfo = SerializerLookupKt.serializerForTypeInfo(this.$format.f10460b, KotlinxSerializationJsonExtensionsKt.argumentTypeInfo(this.$typeInfo));
            d dVar = this.$format;
            KSerializer kSerializer = kSerializerSerializerForTypeInfo;
            EnumC0672b enumC0672b2 = EnumC0672b.f10456k;
            l.f("<this>", dVar);
            l.f("stream", inputStream$default);
            l.f("deserializer", kSerializer);
            G gE = v.e(dVar, new y(inputStream$default), new char[16384]);
            if (gE.x() == 8) {
                gE.g((byte) 8);
                enumC0672b = EnumC0672b.f10457l;
            } else {
                enumC0672b = EnumC0672b.f10456k;
            }
            int iOrdinal = enumC0672b.ordinal();
            if (iOrdinal == 0) {
                uVar = new u(dVar, gE, kSerializer);
            } else {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new D6.r();
                    }
                    throw new IllegalStateException("AbstractJsonLexer.determineFormat must be called beforehand.");
                }
                uVar = new t(dVar, gE, kSerializer);
            }
            return new C2418a(new z(0, uVar));
        }
    }

    public static final Object deserializeSequence(d dVar, ByteReadChannel byteReadChannel, TypeInfo typeInfo, c<? super h> cVar) {
        O5.e eVar = M.a;
        return D.G(O5.d.f7623l, new AnonymousClass2(byteReadChannel, typeInfo, dVar, null), cVar);
    }
}
