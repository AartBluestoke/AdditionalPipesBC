package buildcraft.additionalpipes.pipes;

import net.minecraftforge.common.ForgeDirection;
import buildcraft.additionalpipes.pipes.logic.PipeLogicSwitch;
import buildcraft.transport.PipeTransport;

public class PipeSwitch extends APPipe {

	private final int textureIndex;

	public PipeSwitch(PipeTransport transport, int itemID, int textureIndex) {
		super(transport, new PipeLogicSwitch(), itemID);
		this.textureIndex = textureIndex;
	}

	@Override
	public int getTextureIndex(ForgeDirection direction) {
		return textureIndex + (logic.isPipeConnected(null) ? 0 : 1);
	}

	@Override
	public boolean canConnectRedstone() {
		return true;
	}

}
