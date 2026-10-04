package io.ktor.http.cio;

import A3.d;
import H5.G;
import H5.n0;
import O3.C;
import S5.n;
import com.kusukanime.BuildConfig;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0003\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lio/ktor/http/cio/MultipartEvent;", "", "<init>", "()V", "LO3/C;", BuildConfig.BUILD_TYPE, "Preamble", "MultipartPart", "Epilogue", "Lio/ktor/http/cio/MultipartEvent$Epilogue;", "Lio/ktor/http/cio/MultipartEvent$MultipartPart;", "Lio/ktor/http/cio/MultipartEvent$Preamble;", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class MultipartEvent {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/http/cio/MultipartEvent$Epilogue;", "Lio/ktor/http/cio/MultipartEvent;", "LS5/n;", "body", "<init>", "(LS5/n;)V", "LO3/C;", BuildConfig.BUILD_TYPE, "()V", "LS5/n;", "getBody", "()LS5/n;", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Epilogue extends MultipartEvent {
        private final n body;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Epilogue(n nVar) {
            super(null);
            l.f("body", nVar);
            this.body = nVar;
        }

        public final n getBody() {
            return this.body;
        }

        @Override // io.ktor.http.cio.MultipartEvent
        public void release() throws Exception {
            this.body.close();
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/ktor/http/cio/MultipartEvent$MultipartPart;", "Lio/ktor/http/cio/MultipartEvent;", "LH5/G;", "Lio/ktor/http/cio/HttpHeadersMap;", "headers", "Lio/ktor/utils/io/ByteReadChannel;", "body", "<init>", "(LH5/G;Lio/ktor/utils/io/ByteReadChannel;)V", "LO3/C;", BuildConfig.BUILD_TYPE, "()V", "LH5/G;", "getHeaders", "()LH5/G;", "Lio/ktor/utils/io/ByteReadChannel;", "getBody", "()Lio/ktor/utils/io/ByteReadChannel;", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MultipartPart extends MultipartEvent {
        private final ByteReadChannel body;
        private final G headers;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultipartPart(G g4, ByteReadChannel byteReadChannel) {
            super(null);
            l.f("headers", g4);
            l.f("body", byteReadChannel);
            this.headers = g4;
            this.body = byteReadChannel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C release$lambda$0(MultipartPart multipartPart, Throwable th) {
            if (th != null) {
                ((HttpHeadersMap) multipartPart.headers.j()).release();
            }
            return C.a;
        }

        public final ByteReadChannel getBody() {
            return this.body;
        }

        public final G getHeaders() {
            return this.headers;
        }

        @Override // io.ktor.http.cio.MultipartEvent
        public void release() {
            ((n0) this.headers).x(new d(20, this));
            MultipartJvmAndPosixKt.discardBlocking(this.body);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/http/cio/MultipartEvent$Preamble;", "Lio/ktor/http/cio/MultipartEvent;", "LS5/n;", "body", "<init>", "(LS5/n;)V", "LO3/C;", BuildConfig.BUILD_TYPE, "()V", "LS5/n;", "getBody", "()LS5/n;", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Preamble extends MultipartEvent {
        private final n body;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Preamble(n nVar) {
            super(null);
            l.f("body", nVar);
            this.body = nVar;
        }

        public final n getBody() {
            return this.body;
        }

        @Override // io.ktor.http.cio.MultipartEvent
        public void release() throws Exception {
            this.body.close();
        }
    }

    public /* synthetic */ MultipartEvent(f fVar) {
        this();
    }

    public abstract void release();

    private MultipartEvent() {
    }
}
