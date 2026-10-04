package io.ktor.websocket;

import O3.C;
import P3.r;
import e4.k;
import io.ktor.network.sockets.b;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.websocket.Frame;
import io.ktor.websocket.WebSocketDeflateExtension;
import io.ktor.websocket.internals.DeflaterUtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002/.B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R.\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010$\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010*\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R\u0016\u0010-\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010%¨\u00060"}, d2 = {"Lio/ktor/websocket/WebSocketDeflateExtension;", "Lio/ktor/websocket/WebSocketExtension;", "Lio/ktor/websocket/WebSocketDeflateExtension$Config;", "config", "<init>", "(Lio/ktor/websocket/WebSocketDeflateExtension$Config;)V", "", "Lio/ktor/websocket/WebSocketExtensionHeader;", "negotiatedProtocols", "", "clientNegotiation", "(Ljava/util/List;)Z", "requestedProtocols", "serverNegotiation", "(Ljava/util/List;)Ljava/util/List;", "Lio/ktor/websocket/Frame;", "frame", "processOutgoingFrame", "(Lio/ktor/websocket/Frame;)Lio/ktor/websocket/Frame;", "processIncomingFrame", "Lio/ktor/websocket/WebSocketDeflateExtension$Config;", "Lio/ktor/websocket/WebSocketExtensionFactory;", "factory", "Lio/ktor/websocket/WebSocketExtensionFactory;", "getFactory", "()Lio/ktor/websocket/WebSocketExtensionFactory;", "protocols", "Ljava/util/List;", "getProtocols", "()Ljava/util/List;", "Ljava/util/zip/Inflater;", "inflater", "Ljava/util/zip/Inflater;", "Ljava/util/zip/Deflater;", "deflater", "Ljava/util/zip/Deflater;", "outgoingNoContextTakeover", "Z", "getOutgoingNoContextTakeover$ktor_websockets", "()Z", "setOutgoingNoContextTakeover$ktor_websockets", "(Z)V", "incomingNoContextTakeover", "getIncomingNoContextTakeover$ktor_websockets", "setIncomingNoContextTakeover$ktor_websockets", "decompressIncoming", "Companion", "Config", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WebSocketDeflateExtension implements WebSocketExtension<Config> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(0 == true ? 1 : 0);
    private static final AttributeKey<WebSocketDeflateExtension> key;
    private static final boolean rsv1;
    private static final boolean rsv2 = false;
    private static final boolean rsv3 = false;
    private final Config config;
    private boolean decompressIncoming;
    private final Deflater deflater;
    private final WebSocketExtensionFactory<Config, ? extends WebSocketExtension<Config>> factory;
    private boolean incomingNoContextTakeover;
    private final Inflater inflater;
    private boolean outgoingNoContextTakeover;
    private final List<WebSocketExtensionHeader> protocols;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u0019"}, d2 = {"Lio/ktor/websocket/WebSocketDeflateExtension$Companion;", "Lio/ktor/websocket/WebSocketExtensionFactory;", "Lio/ktor/websocket/WebSocketDeflateExtension$Config;", "Lio/ktor/websocket/WebSocketDeflateExtension;", "<init>", "()V", "Lkotlin/Function1;", "LO3/C;", "config", "install", "(Le4/k;)Lio/ktor/websocket/WebSocketDeflateExtension;", "Lio/ktor/util/AttributeKey;", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "", "rsv1", "Z", "getRsv1", "()Z", "rsv2", "getRsv2", "rsv3", "getRsv3", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements WebSocketExtensionFactory<Config, WebSocketDeflateExtension> {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        @Override // io.ktor.websocket.WebSocketExtensionFactory
        public AttributeKey<WebSocketDeflateExtension> getKey() {
            return WebSocketDeflateExtension.key;
        }

        @Override // io.ktor.websocket.WebSocketExtensionFactory
        public boolean getRsv1() {
            return WebSocketDeflateExtension.rsv1;
        }

        @Override // io.ktor.websocket.WebSocketExtensionFactory
        public boolean getRsv2() {
            return WebSocketDeflateExtension.rsv2;
        }

        @Override // io.ktor.websocket.WebSocketExtensionFactory
        public boolean getRsv3() {
            return WebSocketDeflateExtension.rsv3;
        }

        private Companion() {
        }

        @Override // io.ktor.websocket.WebSocketExtensionFactory
        public WebSocketDeflateExtension install(k config) {
            l.f("config", config);
            Config config2 = new Config();
            config.invoke(config2);
            return new WebSocketDeflateExtension(config2);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\u0004\b\r\u0010\nJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\"\u0010\u001f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u0011R4\u0010$\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\nR.\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'\"\u0004\b+\u0010\n¨\u0006,"}, d2 = {"Lio/ktor/websocket/WebSocketDeflateExtension$Config;", "", "<init>", "()V", "Lkotlin/Function1;", "", "Lio/ktor/websocket/WebSocketExtensionHeader;", "LO3/C;", "block", "configureProtocols", "(Le4/k;)V", "Lio/ktor/websocket/Frame;", "", "compressIf", "", "bytes", "compressIfBiggerThan", "(I)V", "", "build$ktor_websockets", "()Ljava/util/List;", "build", "clientNoContextTakeOver", "Z", "getClientNoContextTakeOver", "()Z", "setClientNoContextTakeOver", "(Z)V", "serverNoContextTakeOver", "getServerNoContextTakeOver", "setServerNoContextTakeOver", "compressionLevel", "I", "getCompressionLevel", "()I", "setCompressionLevel", "manualConfig", "Le4/k;", "getManualConfig$ktor_websockets", "()Le4/k;", "setManualConfig$ktor_websockets", "compressCondition", "getCompressCondition$ktor_websockets", "setCompressCondition$ktor_websockets", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Config {
        private boolean clientNoContextTakeOver;
        private boolean serverNoContextTakeOver;
        private int compressionLevel = -1;
        private k manualConfig = new b(12);
        private k compressCondition = new b(13);

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean compressCondition$lambda$1(Frame frame) {
            l.f("it", frame);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean compressIf$lambda$3(k kVar, k kVar2, Frame frame) {
            l.f("it", frame);
            return ((Boolean) kVar.invoke(frame)).booleanValue() && ((Boolean) kVar2.invoke(frame)).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean compressIfBiggerThan$lambda$4(int i7, Frame frame) {
            l.f("frame", frame);
            return frame.getData().length > i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C configureProtocols$lambda$2(k kVar, k kVar2, List list) {
            l.f("it", list);
            kVar.invoke(list);
            kVar2.invoke(list);
            return C.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C manualConfig$lambda$0(List list) {
            l.f("it", list);
            return C.a;
        }

        public final List<WebSocketExtensionHeader> build$ktor_websockets() {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.clientNoContextTakeOver) {
                arrayList2.add("client_no_context_takeover");
            }
            if (this.serverNoContextTakeOver) {
                arrayList2.add("server_no_context_takeover");
            }
            arrayList.add(new WebSocketExtensionHeader("permessage-deflate", arrayList2));
            this.manualConfig.invoke(arrayList);
            return arrayList;
        }

        public final void compressIf(k block) {
            l.f("block", block);
            this.compressCondition = new io.ktor.client.a(block, this.compressCondition, 3);
        }

        public final void compressIfBiggerThan(final int bytes) {
            compressIf(new k() { // from class: io.ktor.websocket.a
                @Override // e4.k
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(WebSocketDeflateExtension.Config.compressIfBiggerThan$lambda$4(bytes, (Frame) obj));
                }
            });
        }

        public final void configureProtocols(k block) {
            l.f("block", block);
            this.manualConfig = new io.ktor.client.a(this.manualConfig, block, 4);
        }

        public final boolean getClientNoContextTakeOver() {
            return this.clientNoContextTakeOver;
        }

        /* renamed from: getCompressCondition$ktor_websockets, reason: from getter */
        public final k getCompressCondition() {
            return this.compressCondition;
        }

        public final int getCompressionLevel() {
            return this.compressionLevel;
        }

        /* renamed from: getManualConfig$ktor_websockets, reason: from getter */
        public final k getManualConfig() {
            return this.manualConfig;
        }

        public final boolean getServerNoContextTakeOver() {
            return this.serverNoContextTakeOver;
        }

        public final void setClientNoContextTakeOver(boolean z7) {
            this.clientNoContextTakeOver = z7;
        }

        public final void setCompressCondition$ktor_websockets(k kVar) {
            l.f("<set-?>", kVar);
            this.compressCondition = kVar;
        }

        public final void setCompressionLevel(int i7) {
            this.compressionLevel = i7;
        }

        public final void setManualConfig$ktor_websockets(k kVar) {
            l.f("<set-?>", kVar);
            this.manualConfig = kVar;
        }

        public final void setServerNoContextTakeOver(boolean z7) {
            this.serverNoContextTakeOver = z7;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        InterfaceC1444w interfaceC1444wA = null;
        InterfaceC1425d interfaceC1425dB = y.a.b(WebSocketDeflateExtension.class);
        try {
            interfaceC1444wA = y.a(WebSocketDeflateExtension.class);
        } catch (Throwable unused) {
        }
        key = new AttributeKey<>("WebsocketDeflateExtension", new TypeInfo(interfaceC1425dB, interfaceC1444wA));
        rsv1 = true;
    }

    public WebSocketDeflateExtension(Config config) {
        l.f("config", config);
        this.config = config;
        this.factory = INSTANCE;
        this.protocols = config.build$ktor_websockets();
        this.inflater = new Inflater(true);
        this.deflater = new Deflater(config.getCompressionLevel(), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.ktor.websocket.WebSocketExtension
    public boolean clientNegotiation(List<WebSocketExtensionHeader> negotiatedProtocols) {
        Object next;
        l.f("negotiatedProtocols", negotiatedProtocols);
        Iterator<T> it = negotiatedProtocols.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (l.a(((WebSocketExtensionHeader) next).getName(), "permessage-deflate")) {
                break;
            }
        }
        WebSocketExtensionHeader webSocketExtensionHeader = (WebSocketExtensionHeader) next;
        if (webSocketExtensionHeader == null) {
            return false;
        }
        this.incomingNoContextTakeover = this.config.getServerNoContextTakeOver();
        this.outgoingNoContextTakeover = this.config.getClientNoContextTakeOver();
        for (O3.l lVar : webSocketExtensionHeader.parseParameters()) {
            String str = (String) lVar.f7528k;
            String str2 = (String) lVar.f7529l;
            switch (str.hashCode()) {
                case -708713803:
                    if (str.equals("client_no_context_takeover")) {
                        if (!AbstractC2510o.g0(str2)) {
                            throw new IllegalStateException("WebSocket permessage-deflate extension parameter client_no_context_takeover shouldn't have a value. Current: ".concat(str2).toString());
                        }
                        this.outgoingNoContextTakeover = true;
                        break;
                    } else {
                        continue;
                    }
                case 646404390:
                    if (str.equals("client_max_window_bits") && !AbstractC2510o.g0(str2) && Integer.parseInt(str2) != 15) {
                        throw new IllegalStateException("Only 15 window size is supported.");
                    }
                    break;
                case 1266201133:
                    if (str.equals("server_no_context_takeover")) {
                        if (!AbstractC2510o.g0(str2)) {
                            throw new IllegalStateException("WebSocket permessage-deflate extension parameter server_no_context_takeover shouldn't have a value. Current: ".concat(str2).toString());
                        }
                        this.incomingNoContextTakeover = true;
                        break;
                    } else {
                        continue;
                    }
                case 2034279582:
                    str.equals("server_max_window_bits");
                    break;
            }
        }
        return true;
    }

    @Override // io.ktor.websocket.WebSocketExtension
    public WebSocketExtensionFactory<Config, ? extends WebSocketExtension<Config>> getFactory() {
        return this.factory;
    }

    /* renamed from: getIncomingNoContextTakeover$ktor_websockets, reason: from getter */
    public final boolean getIncomingNoContextTakeover() {
        return this.incomingNoContextTakeover;
    }

    /* renamed from: getOutgoingNoContextTakeover$ktor_websockets, reason: from getter */
    public final boolean getOutgoingNoContextTakeover() {
        return this.outgoingNoContextTakeover;
    }

    @Override // io.ktor.websocket.WebSocketExtension
    public List<WebSocketExtensionHeader> getProtocols() {
        return this.protocols;
    }

    @Override // io.ktor.websocket.WebSocketExtension
    public Frame processIncomingFrame(Frame frame) {
        l.f("frame", frame);
        if (!WebSocketDeflateExtensionKt.isCompressed(frame) && !this.decompressIncoming) {
            return frame;
        }
        this.decompressIncoming = true;
        byte[] bArrInflateFully = DeflaterUtilsKt.inflateFully(this.inflater, frame.getData());
        if (this.incomingNoContextTakeover) {
            this.inflater.reset();
        }
        if (frame.getFin()) {
            this.decompressIncoming = false;
        }
        return Frame.INSTANCE.byType(frame.getFin(), frame.getFrameType(), bArrInflateFully, !rsv1, frame.getRsv2(), frame.getRsv3());
    }

    @Override // io.ktor.websocket.WebSocketExtension
    public Frame processOutgoingFrame(Frame frame) {
        l.f("frame", frame);
        if ((!(frame instanceof Frame.Text) && !(frame instanceof Frame.Binary)) || !((Boolean) this.config.getCompressCondition().invoke(frame)).booleanValue()) {
            return frame;
        }
        byte[] bArrDeflateFully = DeflaterUtilsKt.deflateFully(this.deflater, frame.getData());
        if (this.outgoingNoContextTakeover) {
            this.deflater.reset();
        }
        return Frame.INSTANCE.byType(frame.getFin(), frame.getFrameType(), bArrDeflateFully, rsv1, frame.getRsv2(), frame.getRsv3());
    }

    @Override // io.ktor.websocket.WebSocketExtension
    public List<WebSocketExtensionHeader> serverNegotiation(List<WebSocketExtensionHeader> requestedProtocols) {
        Object next;
        l.f("requestedProtocols", requestedProtocols);
        Iterator<T> it = requestedProtocols.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (l.a(((WebSocketExtensionHeader) next).getName(), "permessage-deflate")) {
                break;
            }
        }
        WebSocketExtensionHeader webSocketExtensionHeader = (WebSocketExtensionHeader) next;
        if (webSocketExtensionHeader == null) {
            return P3.y.f7779k;
        }
        ArrayList arrayList = new ArrayList();
        for (O3.l lVar : webSocketExtensionHeader.parseParameters()) {
            String str = (String) lVar.f7528k;
            String str2 = (String) lVar.f7529l;
            Locale locale = Locale.getDefault();
            l.e("getDefault(...)", locale);
            String lowerCase = str.toLowerCase(locale);
            l.e("toLowerCase(...)", lowerCase);
            switch (lowerCase.hashCode()) {
                case -708713803:
                    if (!lowerCase.equals("client_no_context_takeover")) {
                        throw new IllegalStateException(("Unsupported extension parameter: (" + str + ", " + str2 + ')').toString());
                    }
                    if (!AbstractC2510o.g0(str2)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    this.incomingNoContextTakeover = true;
                    arrayList.add("client_no_context_takeover");
                case 646404390:
                    if (!lowerCase.equals("client_max_window_bits")) {
                        throw new IllegalStateException(("Unsupported extension parameter: (" + str + ", " + str2 + ')').toString());
                    }
                case 1266201133:
                    if (!lowerCase.equals("server_no_context_takeover")) {
                        throw new IllegalStateException(("Unsupported extension parameter: (" + str + ", " + str2 + ')').toString());
                    }
                    if (!AbstractC2510o.g0(str2)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    this.outgoingNoContextTakeover = true;
                    arrayList.add("server_no_context_takeover");
                case 2034279582:
                    if (!lowerCase.equals("server_max_window_bits")) {
                        throw new IllegalStateException(("Unsupported extension parameter: (" + str + ", " + str2 + ')').toString());
                    }
                    if (Integer.parseInt(str2) != 15) {
                        throw new IllegalStateException("Only 15 window size is supported");
                    }
                default:
                    throw new IllegalStateException(("Unsupported extension parameter: (" + str + ", " + str2 + ')').toString());
            }
        }
        return r.H(new WebSocketExtensionHeader("permessage-deflate", arrayList));
    }

    public final void setIncomingNoContextTakeover$ktor_websockets(boolean z7) {
        this.incomingNoContextTakeover = z7;
    }

    public final void setOutgoingNoContextTakeover$ktor_websockets(boolean z7) {
        this.outgoingNoContextTakeover = z7;
    }
}
