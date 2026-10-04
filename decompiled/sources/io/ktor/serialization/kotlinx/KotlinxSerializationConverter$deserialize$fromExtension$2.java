package io.ktor.serialization.kotlinx;

import O3.C;
import P3.r;
import S3.c;
import T3.a;
import U3.e;
import U3.j;
import e4.n;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$fromExtension$2", f = "KotlinxSerializationConverter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class KotlinxSerializationConverter$deserialize$fromExtension$2 extends j implements n {
    final /* synthetic */ ByteReadChannel $content;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinxSerializationConverter$deserialize$fromExtension$2(ByteReadChannel byteReadChannel, c<? super KotlinxSerializationConverter$deserialize$fromExtension$2> cVar) {
        super(2, cVar);
        this.$content = byteReadChannel;
    }

    @Override // U3.a
    public final c<C> create(Object obj, c<?> cVar) {
        KotlinxSerializationConverter$deserialize$fromExtension$2 kotlinxSerializationConverter$deserialize$fromExtension$2 = new KotlinxSerializationConverter$deserialize$fromExtension$2(this.$content, cVar);
        kotlinxSerializationConverter$deserialize$fromExtension$2.L$0 = obj;
        return kotlinxSerializationConverter$deserialize$fromExtension$2;
    }

    @Override // e4.n
    public final Object invoke(Object obj, c<? super Boolean> cVar) {
        return ((KotlinxSerializationConverter$deserialize$fromExtension$2) create(obj, cVar)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f9048k;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r.Y(obj);
        return Boolean.valueOf(this.L$0 != null || this.$content.isClosedForRead());
    }
}
