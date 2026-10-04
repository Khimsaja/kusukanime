package E1;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class F extends AbstractC0134c {

    /* renamed from: o, reason: collision with root package name */
    public final int f1843o;

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f1844p;

    /* renamed from: q, reason: collision with root package name */
    public final DatagramPacket f1845q;

    /* renamed from: r, reason: collision with root package name */
    public Uri f1846r;

    /* renamed from: s, reason: collision with root package name */
    public DatagramSocket f1847s;

    /* renamed from: t, reason: collision with root package name */
    public MulticastSocket f1848t;

    /* renamed from: u, reason: collision with root package name */
    public InetAddress f1849u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1850v;

    /* renamed from: w, reason: collision with root package name */
    public int f1851w;

    public F() {
        super(true);
        this.f1843o = 8000;
        byte[] bArr = new byte[2000];
        this.f1844p = bArr;
        this.f1845q = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // E1.h
    public final void close() throws IOException {
        this.f1846r = null;
        MulticastSocket multicastSocket = this.f1848t;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f1849u;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f1848t = null;
        }
        DatagramSocket datagramSocket = this.f1847s;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f1847s = null;
        }
        this.f1849u = null;
        this.f1851w = 0;
        if (this.f1850v) {
            this.f1850v = false;
            k();
        }
    }

    @Override // E1.h
    public final long g(k kVar) throws IOException {
        Uri uri = kVar.a;
        this.f1846r = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f1846r.getPort();
        m();
        try {
            this.f1849u = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f1849u, port);
            if (this.f1849u.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f1848t = multicastSocket;
                multicastSocket.joinGroup(this.f1849u);
                this.f1847s = this.f1848t;
            } else {
                this.f1847s = new DatagramSocket(inetSocketAddress);
            }
            this.f1847s.setSoTimeout(this.f1843o);
            this.f1850v = true;
            q(kVar);
            return -1L;
        } catch (IOException e7) {
            throw new E(e7, 2001);
        } catch (SecurityException e8) {
            throw new E(e8, 2006);
        }
    }

    @Override // E1.h
    public final Uri getUri() {
        return this.f1846r;
    }

    @Override // y1.InterfaceC2385g
    public final int o(byte[] bArr, int i7, int i8) throws IOException {
        if (i8 == 0) {
            return 0;
        }
        int i9 = this.f1851w;
        DatagramPacket datagramPacket = this.f1845q;
        if (i9 == 0) {
            try {
                DatagramSocket datagramSocket = this.f1847s;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f1851w = length;
                b(length);
            } catch (SocketTimeoutException e7) {
                throw new E(e7, 2002);
            } catch (IOException e8) {
                throw new E(e8, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i10 = this.f1851w;
        int iMin = Math.min(i10, i8);
        System.arraycopy(this.f1844p, length2 - i10, bArr, i7, iMin);
        this.f1851w -= iMin;
        return iMin;
    }
}
