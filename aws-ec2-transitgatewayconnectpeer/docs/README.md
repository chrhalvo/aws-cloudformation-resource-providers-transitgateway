# AWS::EC2::TransitGatewayConnectPeer

Resource Type definition for AWS::EC2::TransitGatewayConnectPeer

## Syntax

To declare this entity in your AWS CloudFormation template, use the following syntax:

### JSON

<pre>
{
    "Type" : "AWS::EC2::TransitGatewayConnectPeer",
    "Properties" : {
        "<a href="#transitgatewayattachmentid" title="TransitGatewayAttachmentId">TransitGatewayAttachmentId</a>" : <i>String</i>,
        "<a href="#transitgatewayaddress" title="TransitGatewayAddress">TransitGatewayAddress</a>" : <i>String</i>,
        "<a href="#peeraddress" title="PeerAddress">PeerAddress</a>" : <i>String</i>,
        "<a href="#bgpoptions" title="BgpOptions">BgpOptions</a>" : <i><a href="bgpoptions.md">BgpOptions</a></i>,
        "<a href="#insidecidrblocks" title="InsideCidrBlocks">InsideCidrBlocks</a>" : <i>[ String, ... ]</i>,
        "<a href="#tags" title="Tags">Tags</a>" : <i>[ <a href="tag.md">Tag</a>, ... ]</i>
    }
}
</pre>

### YAML

<pre>
Type: AWS::EC2::TransitGatewayConnectPeer
Properties:
    <a href="#transitgatewayattachmentid" title="TransitGatewayAttachmentId">TransitGatewayAttachmentId</a>: <i>String</i>
    <a href="#transitgatewayaddress" title="TransitGatewayAddress">TransitGatewayAddress</a>: <i>String</i>
    <a href="#peeraddress" title="PeerAddress">PeerAddress</a>: <i>String</i>
    <a href="#bgpoptions" title="BgpOptions">BgpOptions</a>: <i><a href="bgpoptions.md">BgpOptions</a></i>
    <a href="#insidecidrblocks" title="InsideCidrBlocks">InsideCidrBlocks</a>: <i>
      - String</i>
    <a href="#tags" title="Tags">Tags</a>: <i>
      - <a href="tag.md">Tag</a></i>
</pre>

## Properties

#### TransitGatewayAttachmentId

The ID of the Connect attachment.

_Required_: Yes

_Type_: String

_Update requires_: [Replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)

#### TransitGatewayAddress

The peer IP address (GRE outer IP address) on the transit gateway side of the Connect peer, which must be specified from a transit gateway CIDR block. If not specified, Amazon automatically assigns the first available IP address from the transit gateway CIDR block.

_Required_: No

_Type_: String

_Update requires_: [Replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)

#### PeerAddress

The peer IP address (GRE outer IP address) on the appliance side of the Connect peer.

_Required_: Yes

_Type_: String

_Update requires_: [Replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)

#### BgpOptions

The BGP options for the Connect peer.

_Required_: No

_Type_: <a href="bgpoptions.md">BgpOptions</a>

_Update requires_: [Replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)

#### InsideCidrBlocks

The range of inside IP addresses that are used for BGP peering. You must specify a size /29 IPv4 CIDR block from the 169.254.0.0/16 range. The first address from the range must be configured on the appliance as the BGP IP address. You can also optionally specify a size /125 IPv6 CIDR block from the fd00::/8 range.

_Required_: Yes

_Type_: List of String

_Update requires_: [Replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)

#### Tags

_Required_: No

_Type_: List of <a href="tag.md">Tag</a>

_Update requires_: [No interruption](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-no-interrupt)

## Return Values

### Ref

When you pass the logical ID of this resource to the intrinsic `Ref` function, Ref returns the TransitGatewayConnectPeerId.

### Fn::GetAtt

The `Fn::GetAtt` intrinsic function returns a value for a specified attribute of this type. The following are the available attributes and sample return values.

For more information about using the `Fn::GetAtt` intrinsic function, see [Fn::GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-getatt.html).

#### TransitGatewayConnectPeerId

The ID of the Connect Peer.

#### State

The state of the attachment.

